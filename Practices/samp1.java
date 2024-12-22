package Practices;

import java.util.*;

public class samp1 {
       public String input;

     public Set<Character> uniquer(String input){
        Set<Character> uni = new LinkedHashSet<>();
        for(char c : input.toCharArray()){

            uni.add(c);
        }
         return uni;

       }

       public String Creator(Set<Character> inpt, String ab)
       {
       
       String temp = "";
        char c =' ';
        List<Character> strl = new ArrayList<>(inpt);
        StringBuilder strb = new StringBuilder();
        
        for(int i=0;i<strl.size();i++)
        {
            int count = 0;
            for(int j=0;j<ab.length();j++)
            {
               if(strl.get(i)==ab.charAt(j))
               {

                count ++;
              
               }
               
        }
        if(count>1&&strl.get(i)!=' ')
        {
       strb.append(strl.get(i)).append(count).toString();
        }
        temp = strb.toString();

     }
     
     return temp;
    }
  




    public static void main(String[] args) {
        samp1 smp1 = new samp1();

        
        System.out.println("Enter the string");

        String  sc = new Scanner(System.in).nextLine();

        System.out.println(smp1.uniquer(sc).toString());
        
        System.out.println(smp1.Creator(smp1.uniquer(sc), sc));
        
    }
    {

    }
    
}
