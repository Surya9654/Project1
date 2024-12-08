package Practices;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

class StaticAndInstance{
private static String Stat;
private String Ins;
       public StaticAndInstance (String st){
        this.Stat=st;
       }
       public void getStat(){
        System.out.println(Stat);
       }

       public String setIns(String Ins){
        this.Ins=Ins;
        System.out.println(this.Ins);
        return this.Ins;
       }
    public static void main(String[] args) throws UnsupportedEncodingException {
        StaticAndInstance sti = new StaticAndInstance("StaticReferrencePoint");
        StaticAndInstance sti2 = new StaticAndInstance("NewStaticReferrencePoint");
        sti.getStat();
        sti2.getStat();
        //Overriding Static variable;
        StaticAndInstance ins = new StaticAndInstance("Instance");
         sti.getStat();
         sti2.getStat();
        // StaticAndInstance ins1 = new StaticAndInstance("Instance1");
       sti.setIns("OldInstance");
       sti2.setIns("NewInstance");
    }
}
