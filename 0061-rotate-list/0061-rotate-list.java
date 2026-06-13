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
        ListNode curr = head;
        int count = 0;
        if(head == null || head.next ==null)return head;
       
        while(curr!=null){
        count++;
        curr= curr.next;
        }
        k = k%count;
         if(k==0)return head;
        curr= head;
        int idx = 1;
        ListNode front = head;
        ListNode temp = head;
        while(curr!=null){
           
            if(idx==count - k){
                
                 front = curr;
                 curr=curr.next;
                 front.next = null;
                 head = curr;
                 idx++;

                 }
                 else{  
                 idx++;

                    if(curr.next ==null ){
                        curr.next = temp;
                        break;
                    }


                 curr= curr.next;}
                 




        }
        return head;




  }
}