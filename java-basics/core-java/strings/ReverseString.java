package strings;
public class ReverseString {
    public static String str = "surya";

    public static String reverser(String str)
    {
        String temp= "";
        for(int i=str.length()-1;i>=0;i--)
        {
         temp = temp+str.charAt(i);

        }

        return temp;

    }


    public static void main(String[] args) {

        ReverseString rev = new ReverseString();

        System.out.println(reverser(str));

        
    }
    
}
