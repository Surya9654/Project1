package JavaMasterClass;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthTextAreaUI;

class KmToMile{

// write code here
public static long toMilesPerHour(double kilometersPerHour)
{
    long rtrn = kilometersPerHour < 0? -1: (long) Math.round(kilometersPerHour/1.609 );
    return Math.round(rtrn);
}

public static void printConversion(double kilometersPerHour)
{
    
    System.out.println(toMilesPerHour(kilometersPerHour)<0 ? "Invalid value":kilometersPerHour+" km/h = "+  toMilesPerHour(kilometersPerHour) +" mi/h.");;
    
}

//MB to KB converter
public static void printMegaBytesAndKiloBytes (int kiloBytes)
{

  System.out.println(kiloBytes < 0 ? "Invalid Value":kiloBytes+" KB = "+ Math.round (kiloBytes/1024)+" MB and "+  Math.round((((double) kiloBytes/1024)-(kiloBytes/1024))*1000)+" KB");
}

//BArking Dog
public static boolean shouldWakeUp (boolean barking, int hourOfDay )
     {
         if(barking == false || hourOfDay < 0 || hourOfDay > 23 )
         {
             return false;
             
         }
         else if(barking == true && hourOfDay < 8 || hourOfDay >22)
         {
             return true;
            
         }
         return true;
     }


// Leap year
public static boolean isLeapYear(int year)
{
    
    if( year >= 1 && year <= 9999)
    {
        if(year % 4==0 && year % 100 !=0)
        {
            return true;
        }
        else if(year % 100== 0 && year % 400 ==0 ? true : false)
        {
            return true;
        }
    }
    return false;
}

//DecimalComparator
public static boolean areEqualByThreeDecimalPlaces(double a, double b)
{
    System.out.println ((long) (a *1000));
    
         if( (((long) (a*1000) - (long) (b*1000)) < 0 )|| (((long) (a*1000) - (long) (b*1000))!=0))
        {
        return false;
        }
        return true;
}

//TimeCalculatore
public static String timer(int sec)
{
int min = sec/60;
int hour = min /60;
if(min>59){hour++;}
int remsec = sec%60;

int remmin = min%60;
if(sec>59){remmin++;}

return hour+ "h "+ remmin +"min "+ remsec+"sec";


}
//TIMER 
public static String timer(int min, int sec)
{
    if(sec <0 || min <0 ){
        return "please enter positive integer";
    }

int hour = min/60;//6
System.out.println(hour);;
int min1 = sec/60+min%60;// (60*60)= 3600/60--> 60 --> 1 hour
hour = min1 > 59 ? hour+min1/60 : hour; 
int remmin = min1%60;
int remsec = sec%60;


return hour+ "h "+ remmin +"min "+ remsec+"sec";


}

//PALINDROMENUMBER

public static boolean palindrome (int a){
    int reverse = 0;
while(a>0||a!=0){
    int lastdigit = a%10;

    reverse = (reverse * 10)+lastdigit;
    
    a = a/10;
}
System.out.println(reverse);
    if (a==reverse){
        return true;
    }
    return false;
}
//MIN MAX Calculator


    public static void inputThenPrintSumAndAverage ()
    {
        int counter = 0;
         int a =0 ;
          int avg = 0;
           Scanner sc = new Scanner(System.in);
           System.out.println("PLease enter the numbers");
        while(true)
        {
            
            counter++;    
        try{
           
            String input = sc.nextLine();
            a = a+ Integer.parseInt(input);
             avg =(int) Math.round((double) a/counter);
        }
        
        catch(Exception e ){
            System.out.println("SUM = "+a+" AVG = "+avg);
            break;
        }
        }
        
    
    // write code here
}


public static void main(String[] args) {
   //new KmToMile().printConversion(95.75);
   new KmToMile().printMegaBytesAndKiloBytes(2500);
//    System.out.println(new KmToMile().shouldWakeUp(false, 6));
//    System.out.println(new KmToMile().isLeapYear(1700));
//    System.out.println(new KmToMile().areEqualByThreeDecimalPlaces(3.176,3.175));
//    System.out.println(new KmToMile().timer(3945));
//    System.out.println(new KmToMile().timer(700,180));
   System.out.println("----"+new KmToMile().palindrome(11));
new KmToMile().inputThenPrintSumAndAverage();
 
}


}
