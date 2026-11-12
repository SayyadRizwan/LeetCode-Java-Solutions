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
    int count =0;
    void sum(TreeNode root,long sum){
        if(root==null)return;
        if(sum+root.val == target ){
        
            count++;
        }
        sum(root.left,sum+root.val);
        sum(root.right,sum+root.val);
      
    }

    void sumPath(TreeNode root){
        if(root == null)return ;
        sum(root,0);
        sumPath(root.left);
        sumPath(root.right);


    }
    int target = 0;
    public int pathSum(TreeNode root, int targetSum) {
        target = targetSum;
        sumPath(root);
        return count;
    }
}