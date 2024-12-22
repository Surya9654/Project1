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

class EnumAndConstructorPrac {

    public  String name;
      public EnumAndConstructorPrac(String name){
        this.name = new StringBuilder(name).reverse().toString();
      }
      
      
public static void main(String[] args) {
    EnumAndConstructorPrac con = new EnumAndConstructorPrac("surya");
    System.out.println(con.name);
    cons [] enumCons = cons.values();     //getting the enum as array
    for(cons name: enumCons){
        System.out.println(name.name()+"::"+name.getNames());
       
    }
    String Longer = (enumCons[0].getNames().length() > enumCons[1].getNames().length()) ? enumCons[0].getNames() : enumCons[1].getNames(),
       Shorter = (enumCons[0].getNames().length() < enumCons[1].getNames().length()) ? enumCons[0].getNames() : enumCons[1].getNames();
        for (char longchar : Longer.toCharArray()){
          for(char shortchar : Shorter.toCharArray())
          {
            if(longchar == shortchar)
            {
             System.out.println("The duplictes are "+longchar);
            }

            // System.out.println(longchar == shortchar ? "The duplictes are "+longchar:"" );

          }
        }
    } 

    


  
}

    

