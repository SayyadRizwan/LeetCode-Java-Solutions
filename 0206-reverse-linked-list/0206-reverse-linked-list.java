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
ListNode rev(ListNode prev,ListNode curr,ListNode Next) {
    if(curr==null){
        return prev;
    }
    Next=curr.next;
    curr.next=prev;
    
    return rev(curr,Next,Next);
}
    
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        
        return rev(null, head, null);
    }
}