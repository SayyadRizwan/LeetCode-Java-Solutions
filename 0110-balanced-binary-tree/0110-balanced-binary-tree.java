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
 
    int height(TreeNode root){
        if(root==null)return 0;
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left,right)+1;
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        boolean flag = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
            TreeNode curr = q.remove();
            if(curr.left!=null)q.add(curr.left);
            if(curr.right!=null)q.add(curr.right);
            flag = flag && (Math.abs(height(curr.left)-height(curr.right))<=1);
            }
        }
           
       
        return flag;
    }
}