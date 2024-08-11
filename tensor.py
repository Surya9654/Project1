
import numpy as np
import pandas as pd 
#pip install pandas

import matplotlib.pyplot as plt
#pip install matploilib
from IPython.display import clear_output
#pip install matploilib
#from six.moves import urllib

import tensorflow as tf

tf1 = tf.ones([4,5,6])
tf2 = tf.reshape(tf1, [12,10])
#ref--> https://colab.research.google.com/drive/1F_EWVKa8rbMXi3_fG0w7AtcscFq7Hi7B#forceEdit=true&sandboxMode=true



tftrain = pd.read_csv('C:\\Users\\surya\\archive\\titanic3.csv')
tfeval = pd.read_csv('C:\\Users\\surya\\archive\\titanic3eval.csv')

#ref--> https://colab.research.google.com/drive/15Cyy2H7nT40sGR7TBN5wBvgTd57mVKay#forceEdit=true&sandboxMode=true

print(tftrain.describe())

print(tftrain.age.hist(bins=20))

# poping only 'survived' coloumn from the data sheet based on the requirement
y_train = tftrain.pop('survived')
# this y_train might be used as a input 
y_eval = tfeval.pop('survived')
# this y_eval may be used as a input 

assert tftrain.shape == tfeval.shape

#as we have lots of strings in our data, we will be setting Unique values to all unique strings(Categorial coloumns)
# ref 42 & 43 lines

StringColoumns = ['name', 'sex','cabin','home.dest']
NumericColoumns = ['pclass' ,'survived' ,'age' ,'sibsp', 'parch','ticket','ticket','fare','boat','body']
 
feature_columns=[]
for coloumn_name in StringColoumns:
     uniques = tftrain[coloumn_name].unique()
     feature_columns.append(tf.feature_column.categorical_column_with_vocabulary_list(coloumn_name, uniques))

for coloumn_name in NumericColoumns:
  feature_columns.append(tf.feature_column.numeric_column(coloumn_name, dtype=tf.float32))

print(feature_columns)

#now we are going to fetch the data in batches using epochs, epochs is used by model to see the data. If we give epochs=10, 
#our model will look the data set for 10 times, so that our model will understand the pattern of our data provided as unique values
#using tf.feature_column.numeric_column() method


#by using make_input_fn() we are about to seggregate the data and iterate over it which provides the input to the model
def make_input_fn(data_df, label_df, num_epochs=10, shuffle=True, batch_size=32):
  def input_function():  # inner function, this will be returned
    ds = tf.data.Dataset.from_tensor_slices((dict(data_df), label_df))  # create tf.data.Dataset object with data and its label
    if shuffle:
      ds = ds.shuffle(1000)  # randomize order of data
    ds = ds.batch(batch_size).repeat(num_epochs)  # split dataset into batches of 32 and repeat process for number of epochs
    return ds  # return a batch of the dataset
  return input_function  # return a function object for use

train_input_fn = make_input_fn(tftrain, y_train)  # here we will call the input_function that was returned to us to get a dataset object we can feed to the model
eval_input_fn = make_input_fn(tfeval, y_eval, num_epochs=1, shuffle=False)

estmtr = tf.estimator.LineClassifier(feature_columns=feature_columns)

linear_est = tf.estimator.LinearClassifier(feature_columns=feature_columns)
linear_est.train(train_input_fn)  # train
result = linear_est.evaluate(eval_input_fn)  # get model metrics/stats by testing on tetsing data

clear_output()  # clears consoke output
print(result['accuracy']) 

