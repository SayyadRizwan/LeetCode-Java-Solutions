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
    List<Integer> ans = new ArrayList<>();
    void travers1(TreeNode root){
        if(root==null)return;
        if(root.left==null && root.right==null){
            ans.add(root.val);
            return;
        }
        travers1(root.left);
        travers1(root.right);
    }
    boolean travers2(TreeNode root){
        if(root==null)return true;
        if(root.left==null && root.right==null){
            if(ans.size()>0 && ans.get(0)==root.val){
                ans.remove(0);
            }
            else{
                return false;
            }
        }
        boolean left = travers2(root.left);
        boolean right = travers2(root.right);
        return left && right;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        travers1(root1);
        boolean val = travers2(root2);
        return(ans.size()!=0)? false: val;
    }
}