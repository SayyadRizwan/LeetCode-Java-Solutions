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
    int sum(TreeNode root,int low,int high){
        if(root==null)return 0;
        int right =0;
        int left =0;
        int curr = (root.val>=low && root.val<=high)? root.val : 0;
         if(root.val>low){
            left = sum(root.left,low,high);
        }
        if(root.val<high){
            right = sum(root.right,low,high);
        }
        return left +right + curr;

    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        return sum(root,low,high);
    }
}