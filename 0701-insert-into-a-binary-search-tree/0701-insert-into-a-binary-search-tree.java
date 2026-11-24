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
    void insert(TreeNode root,int key){
        if(root==null)return;
        if(root.val>key){
            if(root.left==null)root.left = new TreeNode(key);
            else{
                insert(root.left,key);
            }
        }
        else{
            if(root.right==null)root.right = new TreeNode(key);
            else insert(root.right,key);
        }

    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        insert(root,val);
        if(root==null)root = new TreeNode(val);
        return root;
    }
}