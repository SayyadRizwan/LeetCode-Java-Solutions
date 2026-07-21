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
    int max[] =new int[1];
  
    int maxPath(TreeNode root){
        if(root==null)return 0;
        int left = Math.max(0,maxPath(root.left));
        int right = Math.max(maxPath(root.right),0);
        max[0] = Math.max(max[0],((left + right)+root.val));
        return Math.max(left,right)+root.val;
    }




    public int maxPathSum(TreeNode root) {
          max[0]=-10000;
         maxPath(root);
         return max[0];
    }
}