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
    int ans =0;
    void sum(TreeNode root,String curr){
        if(root==null)return ;
        if(root.left==null && root.right==null){
            int val = Integer.parseInt(curr);
            ans+=val;
        }
       if(root.left!=null) sum(root.left,curr+root.left.val);
  if(root.right!=null) sum(root.right,curr+root.right.val);
  return;


    }
        
    //     int l = (root.left==null)?0:root.left.val;
    //     int r = (root.right==null)?0:root.right.val;
    //     int left = sum(root.left,curr)
    //      int right = (root.right!=null)?(sum(root.right)*10)+root.right.val:0;
    //      if(root.left==null)
    //      return left+right;



    // }
    public int sumNumbers(TreeNode root) {
        if(root==null)return 0;
        sum(root,root.val+"");
        return ans;
    }
}