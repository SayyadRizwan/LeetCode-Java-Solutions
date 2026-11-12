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
    int min = Integer.MIN_VALUE;
    int max = min;
    int sum(TreeNode root){
        if(root==null)return 0;
        int left = sum(root.left);
        int right = sum(root.right);
       
        if(left<0)left =0;
        if(right<0)right =0;
         int val = Math.max(left,right);
        int fin =(Math.max(left + right+root.val,val +root.val));
        max =Math.max(left+right+root.val,max);
        return val + root.val;

    }

    // void maxSum(TreeNode root){
    //     if(root==null)return ;
    //     max =Math.max(max,sum(root));
    //     maxSum(root.left);
    //     maxSum(root.right);
    //     return;
       
    // }
    public int maxPathSum(TreeNode root) {
      sum(root);
      return max;

    }
}