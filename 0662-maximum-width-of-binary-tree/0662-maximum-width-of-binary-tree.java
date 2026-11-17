/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   class Pair{
    TreeNode node;
    long index;
    Pair(TreeNode node,long index){
        this.index = index;
        this.node = node;
    }
   }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        if(root==null)return 0;
        q.add(new Pair(root,0));
        long ans = 0;
        while(!q.isEmpty()){
            int size =q.size();
            long st=0;
            long end = size-1;

            for(int i=0;i<size;i++){
                TreeNode curr = q.peek().node;
                long val = q.remove().index;
                if(i==0)st = val;
                if(i==size-1) end = val;
                if(curr.left!=null)q.add(new Pair(curr.left,(val*2)+1));
                if(curr.right!=null)q.add(new Pair(curr.right,(val*2)+2));

            }
          
                ans = Math.max(ans,end -st+1);
           

        }
        return (int)ans;
    }
}