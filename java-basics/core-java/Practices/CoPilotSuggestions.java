package Practices;

enum Cons {  // Enum is known as enumerator
    PERSON1("surya"), PERSON2("shivani"); // Enum constants 'PERSON1' is the constant name, "surya" is the constant's value

    private String names;

    private Cons(String name) { // Via enum constructor we are storing all the constant's value to 'names' var
        this.names = name;
    }

    public String getNames() { // To retrieve the values of the variable 'names' we use getter
        return this.names;
    }
}

class ConstructorPrac {

    public String name;

    public ConstructorPrac(String name) { //constructor of the ConstructPrac class
        StringBuilder temp = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            temp.append(name.charAt(i));
        }
        this.name = temp.toString();
    }

    public static void main(String[] args) {
        ConstructorPrac con = new ConstructorPrac("surya");
        System.out.println(con.name);

        Cons[] enumCons = Cons.values(); // Getting the enum as array
        for (Cons name : enumCons) {
            System.out.println(name.name() + "::" + name.getNames());
        }
        //using Ternary Operators
        //condition ? expressionIfTrue : expressionIfFalse;
        String longerName = enumCons[0].getNames().length() > enumCons[1].getNames().length() ? enumCons[0].getNames() : enumCons[1].getNames();
        String shorterName = enumCons[0].getNames().length() > enumCons[1].getNames().length() ? enumCons[1].getNames() : enumCons[0].getNames();

        for (int i = 0; i < longerName.length(); i++) {
            for (int j = 0; j < shorterName.length(); j++) {
                if (longerName.charAt(i) == shorterName.charAt(j)) {
                    System.out.println("This letter duplicates: " + longerName.charAt(i));
                }
            }
        }
    }
}
