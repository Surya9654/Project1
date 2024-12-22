package Practices;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

class CTS extends CTSParent{

    String dups ;       
    public static void main(String[] args) throws UnsupportedEncodingException {
       CTS smp2 = new CTS();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your string to identify the duplicates");
       String input = sc.nextLine();
       System.out.println(smp2.Creator(smp2.uniquer(input), input )+"\n");
    }
}
