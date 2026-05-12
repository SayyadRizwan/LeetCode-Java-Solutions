
class Solution {

    //midfinder
    ListNode midfinder(ListNode slow, ListNode fast) { 
       
        if (fast == null) {
            return slow;
        }
         if (fast.next == null) {
            return slow;
        }
        return midfinder(slow.next, fast.next.next);
    }

    //size checker
    boolean isEven(ListNode head, int idx) {
        if (head.next == null) {
            return !((idx % 2) == 0);
        }
        head = head.next;
        return isEven(head, idx + 1);

    }
//reverse
ListNode reverse(ListNode mid){
ListNode prev=null;
ListNode curr=mid;
ListNode next;
while(curr!=null){
next=curr.next;
curr.next=prev;
prev=curr;
curr=next;

}
return prev;
}
//check
    boolean check(ListNode head,ListNode mid){
        if(mid==null){
            return true;
        }
        if(head.val==mid.val){
            return check(head.next,mid.next);
        }
        else{
            return false; 
        }
    }
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;        // single node
    if (head.next.next == null) return head.val == head.next.val; // 2 nodes

        // For even
        ListNode mid=midfinder(head,head);
        if(isEven(head,0)){
            ListNode reversed_mid=reverse(mid);
            return check(head,reversed_mid);
        }
        ListNode reversed_mid=reverse(mid.next);
                   return check(head,reversed_mid); 
        
    }
}