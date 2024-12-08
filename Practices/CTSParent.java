package Practices;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class CTSParent{

public  Set<Character> uniquer(String ab)
    {
       
       Set<Character> uniqueCharsSet = new LinkedHashSet<>();
        for(char g : ab.toCharArray()){
            uniqueCharsSet.add(g);
        }

       return uniqueCharsSet;
    }

public int sum(int c, int d, int e){
      
    int temp = c + d + e;
    return temp;

}

 public String Creator(Set<Character> ab, String abc)
    {
        StringBuilder strb = new StringBuilder();
        List<Character> list = new ArrayList<>(ab);
        for(int i=0;i<list.size();i++)
        {
            int count = 0;
          for (int j=0;j<abc.length();j++)
          {
            if (list.get(i)==abc.charAt(j))
            {
             count ++;
            }
          }
          if(count>1&&list.get(i)!=' '){
          strb.append(list.get(i)).append(count);
          }

        }
        String temp = strb.toString();
     return temp;
    }

}
