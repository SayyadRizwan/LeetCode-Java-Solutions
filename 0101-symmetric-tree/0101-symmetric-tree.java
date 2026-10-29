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
    public boolean isSymmetric(TreeNode root) {
     //   List<List<Integer>> level = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null)return true;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level  = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.remove();
                if(curr==null)level.add(-111);
else{
    q.add(curr.left);
             
                q.add(curr.right);
                level.add(curr.val);
}
            }
            int st=0;
            int end= level.size()-1;
            while(st<end){
                if(level.get(st)!=level.get(end)){
                    return false;
                }
                st++;
                end--;
            }

        }
        return true;
    }
}