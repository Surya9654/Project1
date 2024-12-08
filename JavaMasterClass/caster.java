package JavaMasterClass;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

class caster{

 public Double LbsToKg(int lbs)
 {
 return lbs*0.45359237;
 }     
    public static void main(String[] args) throws UnsupportedEncodingException
     {
        
        System.out.println("Converted to Kg "+(new caster().LbsToKg(Integer.parseInt(System.console().readLine("Enter the pounds ")))));
        System.out.println();
    }
}
