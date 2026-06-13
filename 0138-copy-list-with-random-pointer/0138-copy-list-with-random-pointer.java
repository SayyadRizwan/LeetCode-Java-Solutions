/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hm = new HashMap<>();
        Node curr = head;
        Node newHead = new Node(5);
        Node newcurr = newHead;
        while(curr!=null){
            Node temp = new Node(curr.val);
            newcurr.next = temp;
            newcurr = temp;
             hm.put(curr,newcurr);
             curr=curr.next;

        }
        curr= head;
        newcurr = newHead.next;
        while(curr!=null){
            newcurr.random = hm.get(curr.random);
            curr= curr.next;
            newcurr= newcurr.next;
        }



    
        return newHead.next;
}}