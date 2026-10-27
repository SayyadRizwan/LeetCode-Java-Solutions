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
    TreeNode invert(TreeNode root){
        if(root==null)return root;



        // if(root.left==null || root.right==null){
        //     if(root.left==null && root.right ==null)return root;
        //     if(root.left==null){
        //         root.left=root.right;
        //         root.right=null;
        //     }
        //      else{
        //         root.right=root.left;
        //         root.left=null;
        //     }
        // }
      TreeNode l = invert(root.left);
       TreeNode r =invert(root.right);
       root.left =r;
       root.right=l;
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
       TreeNode ans = invert(root);
        return ans;
    }
}