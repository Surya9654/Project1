package JavaMasterClass;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import oopsconcepts.thisAsMethodParameter;

class CarManufacturer{

    private String Make ="";
    private String MfdDate = "";
    private String type = "";

    public void setMake(String Make)
    {
        if(Make == null) this.Make = "Invalid";
        
        switch(Make.toLowerCase())
        {
            case "honda", "chevy", "kia" -> this.Make = Make; default -> {this.Make = "Unsupported";}
 
        }
        
    }

    public void setMfdDate(String date)
    {
        if(date == null ) this.MfdDate="Inavlid";

        switch(Integer.parseInt(date)){
            case 1997, 1998, 1999 -> this.MfdDate=date;
            default -> this.MfdDate="Unsupported";
        }

       
    }

    public void setType(String type)
    {
        if(type == null) this.type = "Invalid" ;
        
        switch(type.toLowerCase())
        {
            case "hatchBack", "suv", "sedan" -> this.type = type; default -> {this.type = "Unsupported";}
 
        }
        
    }
    public String getMake()
    {
        return Make;
    }
    public String getType()
    {
        return type;
    }
    public String getMfdDate()
    {
        return MfdDate;
    }




    public static void main(String[] args) {
        CarManufacturer car = new CarManufacturer();
    Scanner sc = new Scanner(System.in);

    while(true)
    {

        car.setMake(System.console().readLine("Please type the make that you want= "));
        System.out.println("your type is "+ car.getMake());
        break;

    }

}
}
