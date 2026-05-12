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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int rem = 0;
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (l1 != null && l2 != null) {
            temp.next = new ListNode((l1.val + l2.val + rem) % 10);
            rem = (l1.val + l2.val+rem) / 10;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            temp.next = new ListNode((l1.val + rem) % 10);
            rem = (l1.val + rem) / 10;
            temp = temp.next;
            l1 = l1.next;
            // l2=l2.next;
        }
        while (l2 != null) {
            temp.next = new ListNode((l2.val + rem) % 10);
            temp = temp.next;
            rem = (l2.val + rem) / 10;
            l2 = l2.next;
        }
        if (rem != 0) {
            temp.next = new ListNode(rem );
            //  rem/=10;
        }
        return head.next;
    }
}