package Practices;
import java.util.*;
  
public class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target)
            {
                out[0]=i;
                out[1]=j;
                break;
            }  
            
  
        }
    }
        System.out.println(out[0]);
        System.out.println(out[1]);
        
        return out;
    }

    public static void main(String[] args) {
    {
        System.out.println("Enter the size");
        int[] in = new int[new Scanner(System.in).nextInt()];
        for(int i =0;i<in.length;i++){
            System.out.println("Enter the number");
                    in[i]= new Scanner(System.in).nextInt();
        }
        System.out.println("Enter the target");
        int tar  = new Scanner(System.in).nextInt();

        new TwoSum().twoSum(in, tar);
      
    }
}
}
