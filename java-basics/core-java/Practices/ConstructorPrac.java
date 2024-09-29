package Practices;

enum cons{                                              //enum is known as enumurator
       Person1("surya"), Person2("shivani"); //enum constants 'Person1' is the constant name 
                                                       //"surya" is the Constant's value


       private String names; 

       private cons(String name){ //via constructor we are storing all the constant's value to 'names' var
        this.names = name;
       }
       public String getNames() // to retreive the values of the variable 'names' we user getter
       {
         return this.names;
       }

}

class ConstructorPrac {

    public  String name;

      public ConstructorPrac(String name){
        String temp="";
        for(int i=name.length()-1;i>=0;i--){
             temp = temp+name.charAt(i);
        }
        this.name= temp;
      }
      
      
public static void main(String[] args) {
    ConstructorPrac con = new ConstructorPrac("surya");
    System.out.println(con.name);
    cons [] enumCons = cons.values();     //getting the enum as array
    for(cons name: enumCons){
        System.out.println(name.name()+"::"+name.getNames());
    }
    
    
    if(enumCons[0].getNames().length()>enumCons[1].getNames().length())
    {
       for(int i=0;i<=enumCons[0].getNames().length()-1;i++)
       {
        for(int j=0;j<=enumCons[1].getNames().length()-1;j++)
        {
            if(enumCons[0].getNames().charAt(i)==enumCons[1].getNames().charAt(j))
            {
              System.out.println(enumCons[0].getNames().charAt(i));
            }
           
        }
        
       }
    }

    else if(enumCons[0].getNames().length()<enumCons[1].getNames().length())
    {
        for(int i=0;i<=enumCons[1].getNames().length()-1;i++)
       {
        for(int j=0;j<=enumCons[0].getNames().length()-1;j++)
        {
            if(enumCons[1].getNames().charAt(i)==enumCons[0].getNames().charAt(j))
            {
              System.out.println("this letter duplicates "+enumCons[1].getNames().charAt(i));
            }
           
        }
        
       }
    }
         

    }


  
}
    

