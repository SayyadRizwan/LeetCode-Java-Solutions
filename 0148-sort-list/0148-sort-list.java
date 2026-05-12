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

    ListNode MergeSort(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode mid = getMidNode(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode Left = MergeSort(head);
        ListNode Right = MergeSort(right);
        return Merge(Left, Right);
    }

    private ListNode getMidNode(ListNode head) {
    ListNode slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
    ListNode Merge(ListNode left, ListNode right) {
        ListNode tempHead = new ListNode(0);
        ListNode temp = tempHead;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }
        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return tempHead.next;
    }

    public ListNode sortList(ListNode head) {
        return MergeSort(head);
    }
}