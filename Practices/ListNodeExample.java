package Practices;

import java.io.UnsupportedEncodingException;
import java.util.*;

class  ListNode
{
   int val;
   private ListNode next;
   private static int[] arr = {1,2,3};
   private static int[] arr1 = {4,5,6};
   
  
  
  public ListNode (int val){
  this.val = val;
  }
   
   public static ListNode arraytoList(int[] ab)
   {
       if(ab.length==0) return null;

       ListNode head = new ListNode(ab[0]);
       ListNode current = head;
       

       for(int i=1;i<ab.length;i++)
       {
         current.next = new ListNode(ab[i]);
         current = current.next;
             
       }

     return head;
   }
   public static void printList(ListNode head) {
      ListNode current = head;
      while (current != null) {
          System.out.print(current.val + " ");
          current = current.next;
      }
      System.out.println();
  }

   public static void main(String[] args) {
   
       ListNode head = arraytoList(arr);
     ListNode secondHead = arraytoList(arr1);

     ListNode current = head;

     while(current.next != null){
        current =current.next;

     }
     current.next = secondHead;
     
   // connecting the two lists
    printList(head); 
      

      
      
   }

}
