/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null) return null;
      //size checking
        ListNode temp=head;
        int count=0;
        while(temp!=null){
        count+=1;
            temp=temp.next;
        }
        k=k;
         k=k%count;
       
           if(head==null||head.next==null||k==0) return head;
        
        temp=head;
        ListNode newHead1=new ListNode(0);
        ListNode LL1=newHead1;
        ListNode newHead2=new ListNode(1);
        ListNode LL2=newHead2;
        int index=0;
        while(temp!=null){
            if(index<count-k){
                LL2.next=temp;
                LL2=LL2.next;
                
            }
            else{
                LL1.next=temp;
                LL1=LL1.next;
                
            }
            temp=temp.next;
            index++;
            
        }
       newHead1= newHead1.next;
        newHead2= newHead2.next;
        LL1.next=newHead2;
        LL2.next=null;
        return newHead1;
        
        
        
        
        
        
        }
        
        
    }
