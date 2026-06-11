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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int val = count/k;
        curr=head;
        ListNode nums[] = new ListNode[count];
        int idx=0;
         while(curr!=null){
            nums[idx]=curr;
            curr=curr.next;
            idx++;
        }

        for(int i=0;i<val;i++){
            int st = i * k;
            int end = st + k-1;
            while(st<end){
                ListNode temp = nums[st];
                nums[st]= nums[end];
                nums[end]=temp;
                st++;
                end--;
            }
        }

        for(int i=0;i<nums.length-1;i++){
                nums[i].next=nums[i+1];
        }
        nums[nums.length-1].next=null;
        return nums[0];


    }
}