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

    ListNode reversalLL(ListNode mid){
         
            ListNode curr=mid;
            ListNode prev=null ;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            
            curr=next;
        }
        return prev;
    }


    
    ListNode midFinder(ListNode slow,ListNode fast){
        while(fast!=null&&fast.next!=null){
            if(fast==slow){
                return slow;
            }
            fast=fast.next.next;
            slow=slow.next;
            
        }
        return slow;
    }


 //   ListNode reversal()
    public void reorderList(ListNode head) {
        if(head==null||head.next==null)return ;
      ListNode prev_mid=  midFinder(head.next,head.next.next);
        ListNode mid=prev_mid.next;
        prev_mid.next=null;
        mid=reversalLL(mid);
 
        




        
        ListNode dummyNew=new ListNode(0);
        ListNode NewHead=dummyNew;
        ListNode temp1=head;
        ListNode temp2=mid;
        while(temp1!=null&& temp2!=null){
            dummyNew.next=temp1;
            dummyNew=dummyNew.next;
            temp1=temp1.next;
            dummyNew.next=temp2;
            dummyNew=dummyNew.next;
            temp2=temp2.next;
        }
        while(temp1!=null){
            dummyNew.next=temp1;
            dummyNew=dummyNew.next;
            temp1=temp1.next; 
        }
        dummyNew.next=null;
        head=NewHead.next;
        
    }
}