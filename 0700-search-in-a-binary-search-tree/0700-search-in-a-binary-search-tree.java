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
    int key;
    TreeNode search(TreeNode root){
        if(root==null)return null;
        if(root.val==key)return root;
        if(key<root.val)return search(root.left);
        return search(root.right);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        key = val;
        return search(root);
    }
}