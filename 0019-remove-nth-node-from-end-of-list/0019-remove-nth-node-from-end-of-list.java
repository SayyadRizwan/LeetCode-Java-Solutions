class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Step 1: Find the size of the linked list
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Step 2: If n == size, remove the head node
        if (n == size) {
            return head.next;
        }

        // Step 3: Go to (size - n - 1)th node
        int diff = size - n;
        temp = head;
        for (int i = 1; i < diff; i++) {
            temp = temp.next;
        }

        // Step 4: Remove the node
        temp.next = temp.next.next;

        return head;
    }
}