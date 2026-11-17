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
    boolean areEqual(TreeNode root,TreeNode subroot){
        if(root==null && subroot==null)return true;
        if(root==null || subroot==null)return false;
        if(root.val !=subroot.val)return false;
        boolean left = areEqual(root.left,subroot.left);
        boolean right = areEqual(root.right,subroot.right);
        return (left && right);
    }
    boolean ans = false;
    void isSubT(TreeNode root,TreeNode subroot){
        if(root==null)return ;
        if(root.val == subroot.val){
            ans = ans || areEqual(root,subroot);
        }
        isSubT(root.left,subroot);
        isSubT(root.right,subroot);


    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        isSubT(root,subRoot);
        return ans;
    }
}