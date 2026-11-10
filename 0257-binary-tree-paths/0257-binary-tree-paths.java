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
    void treePaths(TreeNode root,String str){
        if(root==null){
            
            return ;
        }
        if(root.left==null && root.right==null){
             str+= Integer.toString(root.val);
            ans.add(str);
            return ;
        }
        
     //   ans.add(str);
       str+= Integer.toString(root.val);
        str+="->";
    treePaths(root.left,str);
    treePaths(root.right,str);
      
         return ;



    }
    List<String> ans ;
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        treePaths(root,"");
        return ans;
    }
}