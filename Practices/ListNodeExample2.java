package Practices;

import java.io.UnsupportedEncodingException;
import java.util.*;

class  ListNode
{
int val;
ListNode connects;

//Constructor
public ListNode(int val)
{
  this.val = val;
}

public static ListNode arraytoList(int [] ab)
{
  ListNode head = new ListNode(ab[0]); // using head variable we are pointing to the firstelement

  ListNode chain = head; // By using chain we are going to construct a linked list 
                         // with help pf thier address
List<Integer> lst  = new ArrayList<>();


for(int i: ab){
  chain.connects  = new ListNode(ab[i]);
  chain = chain.connects;
  
}


 return head;
}

public static void LsitPrinter(ListNode head)
{

  ListNode current = head;
  while(current.connects != null){

    System.out.println(current.val +" ");
    current = current.connects;
  }





}

public static void main(String[] args) 
{
  int [] ab = {1,2,3};
  int [] ab1 = {4,5,6};
  
ListNode head = arraytoList(ab);
ListNode secondHead = arraytoList(ab1);

ListNode current = head;

while(current.connects != null){
  current  = current.connects;
}
current.connects = secondHead;

while(current.connects != null){
  current  = current.connects;
}

ListNode.LsitPrinter(head);


}



}
      
      
   


