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
    boolean isSum(TreeNode root,int sum){
       
        if(root==null)return false;
         if(sum-root.val==0 && (root.left == null &&root.right==null))return true;
        
        boolean left = isSum(root.left,sum-root.val);
        boolean right = isSum(root.right,sum-root.val);
        return left || right;


    }


    public boolean hasPathSum(TreeNode root, int targetSum) {
    return isSum(root,targetSum);
    }
}