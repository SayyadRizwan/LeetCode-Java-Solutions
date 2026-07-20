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
    void sum(TreeNode root,int sum,List<List<Integer>> ans , List<Integer> temp,int currSum){
        if(root==null){
            return ;
           
        }
        currSum+=root.val;

        if(root.left==null && root.right==null){
             if(currSum==sum){
                temp.add(root.val);
                ans.add(new ArrayList<Integer>(temp));
                temp.remove(temp.size()-1);
               
            }
             return ;
        }
        temp.add(root.val);
        sum(root.left,sum,ans,temp,currSum);
        sum(root.right,sum,ans,temp,currSum);
        temp.remove(temp.size()-1);



    }



    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(root,targetSum,ans,new ArrayList<>(),0);
        return ans;
         
    }
}