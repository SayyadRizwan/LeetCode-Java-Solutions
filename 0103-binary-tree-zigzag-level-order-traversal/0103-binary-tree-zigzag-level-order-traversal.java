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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
           int ctr =0;
        while(!q.isEmpty()){
         
            int size = q.size();
            List<Integer> l = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode curr = q.remove();
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);

                if(ctr%2==1){
                    l.add(0,curr.val);
                }
                else{
                   l.add(curr.val); 
                }
            }
            ctr++;
            ans.add(l);
        }
        return ans;
    }
}