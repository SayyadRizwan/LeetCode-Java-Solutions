/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;N
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hs = new HashSet<>();
        ListNode curr1 = headA;
        ListNode curr2 = headB;
        while(curr1!=null && curr2!=null){
            if(hs.contains(curr1) ){
                return curr1;
            }
            hs.add(curr1);
            if(hs.contains(curr2) ){
                return curr2;
            }
            hs.add(curr2);
            curr1 = curr1.next;
            curr2=curr2.next;

            
        }

while(curr1!=null){
    if(hs.contains(curr1))return curr1;
    curr1=curr1.next;
   // hs.add(curr1);
}
while(curr2!=null){
    if(hs.contains(curr2))return curr2;
    curr2=curr2.next;
  //  hs.add(curr2);
}

        return null;
    }
}