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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=new ListNode(0);
        prev.next=slow;
        if(head.next==null)return null;
        while(fast!=null && fast.next!=null){
      /*      if(fast==slow && fast!=head){
                prev.next=prev.next.next;
                break;
            } */
            prev.next=slow;
            prev=prev.next;
                
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}