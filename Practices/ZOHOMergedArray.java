package Practices;

import java.util.*;

import collections.HashSetExample;
import input.output.ScannerClass;
import misc.CollectionSort;

public class ZOHOMergedArray {
        
        public List<Integer> merger(int[] a, int [] b)
        {
            int [] merged= null;
            Set<Integer> merge = new HashSet();
              for(int i : a){
                merge.add(i);
              }
              for(int i : b){
                merge.add(i);
              }
              System.out.println("the unique set "+merge);
              List<Integer> lst = new ArrayList(merge);

              for(int j =0;j<lst.size()-1;j++){
              for(int i=0;i<lst.size()-1;i++){
              if(lst.get(i)>lst.get(i+1))
              {
                int temp = lst.get(i);
              lst.set(i, lst.get(i+1));
              lst.set(i+1,temp);
              }

              }
            }

            
             

            return lst;
        }




    public static void main(String[] args) {
        ZOHOMergedArray zh = new ZOHOMergedArray();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please Enter the Size of the First Array");
        int size = sc.nextInt();
         int [] FirstArray = new int[size];
        System.out.println("Now enter the elements");

        for(int i=0;i<size;i++){
          FirstArray[i]=sc.nextInt(); 
        }

        System.out.println("Please Enter the Size of the Second Array");
        int size2 = sc.nextInt();
        int [] SecondArray = new int[size2];
        System.out.println("Now enter the elements for Second Array");

        for(int i=0;i<size2;i++){
          SecondArray[i]=sc.nextInt(); 
        }
        System.out.println(zh.merger(FirstArray, SecondArray));

    }

}