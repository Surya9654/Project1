package JavaMasterClass;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import oopsconcepts.thisAsMethodParameter;

class ATM{

    private String UserName;
    private String pswd;
    private String AccoutType;
    private Double Balance = 1000.0;
    private long Deposit ;
    private long Withdrawl;
    private Set AccountNumber;
    private boolean accnflag;
    private int[] nums = {123, 4567, 789, 012, 345};
    private int attmpts = 3;
    
//Constructor
private ATM(int accn){
  Set<Integer> accnnums = new HashSet<>();
  for(int i : nums){
    accnnums.add(i);
  }
  accnflag = accnnums.contains(accn);
  

}





    private String enocder(String a){

        return Base64.getEncoder().encodeToString(a.getBytes());
    }
    public  Boolean setUserName(String name)
    {
        this.UserName = name;
      return !name.isEmpty();
    }

    public  Boolean setpswd(String pwd)
    {

      while(pwd.length()<3)
      {
        if (attmpts==0) {
          System.out.println("Account locked !!!");
          System.exit(0);
        }
        pwd = System.console().readLine("---Please enter the 3 digit of your passwrod: ");
        attmpts--;
        System.out.println("Number of attempts remaining: "+ attmpts);
        
    }
        //Encoding the password
      this.pswd = enocder(pwd) ;
       
      return !pwd.isEmpty();
    }

    public  boolean setAccoutType(String accntype)
    {
        this.AccoutType = accntype;
        return !accntype.isEmpty();
    }

    public  double getBalance()
    {
    
      return this.Balance;

    }

    public  double setDeposit(long a)
    {
    
      this.Balance += a;
      System.out.println("Deposited");

      return this.Balance;

    }

    public double setWithdrawl(long a)
    {
        this.Balance -= a;

        return this.Balance;

    }

    public static void main(String[] args) {
        ATM atm = new ATM(Integer.parseInt(System.console().readLine("please Enter your account number: ")));
        
       if(!atm.accnflag) {
        System.out.println();
        System.out.println("******* "+"Could'nt find your account"+" *******");
        System.out.println();
        System.exit(0);
       }
       System.out.println();
        System.out.println("    ********* WELCOME ************   ");
        System.out.println();


     if(atm.setUserName(System.console().readLine("User name: ")) && atm.setpswd(System.console().readLine("User password: "))&& atm.setAccoutType((System.console().readLine("AccoutnType: ")))) 
 {
       System.out.println("What fucntion you wanna perfom");
         
        
       
    switch(Integer.parseInt(System.console().readLine("Press '1' for Fetching Balance, Press '2' for Deposit, Press '3' for withdrwal: "))){
      //Balance functionality
         case 1:
         {
            System.out.println("Your balance is "+atm.getBalance());
            switch(Integer.parseInt(System.console().readLine( "Press '1' for Deposit, Press '2' for withdrwal: ")))
            {
              case 1:
         {
            System.out.println("please enter the Deposit amount:");
            System.out.println("Your balance is "+atm.setDeposit((long) (new Scanner(System.in).nextDouble())));
            break;
         }
        case 2:
        {
          
            System.out.println("please enter the Withdrawl amount:");
            System.out.println("Your balance is "+atm.setWithdrawl((long) (new Scanner(System.in).nextDouble())));
            break;
        }
        default :  {System.out.println("Cannot process at this moment");}
            }
            break;
         }
        
         case 2:
         {
            System.out.println("please enter the Deposit amount:");
            System.out.println("Your balance is "+atm.setDeposit((long) (new Scanner(System.in).nextDouble())));
            break;
         }
        case 3:
        {
          
            System.out.println("please enter the Withdrawl amount:");
            System.out.println("Your balance is "+atm.setWithdrawl((long) (new Scanner(System.in).nextDouble())));
            break;
        }
        default :  {System.out.println("Cannot process at this moment");}
      }
        }

       


     else {
        System.out.println("Account does not exist");
    }
     
    }
}

    

