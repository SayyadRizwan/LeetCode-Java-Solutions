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
    long prev = Long.MIN_VALUE;
    boolean isBST(TreeNode root){
        if(root==null)return true;
        
        
        boolean left = isBST(root.left);
        if(root.val<=prev)return false;
        prev = root.val;
        boolean right = isBST(root.right);
        
        return left && right;

    }
    public boolean isValidBST(TreeNode root) {
        return isBST(root);
    }
}