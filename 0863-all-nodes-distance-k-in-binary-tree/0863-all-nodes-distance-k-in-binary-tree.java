/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
HashMap<TreeNode,TreeNode> hm ;
    List<Integer> ans = new ArrayList<>();
    TreeNode trgt;
    int ideal ;
    HashSet<TreeNode> vs = new HashSet<>();
    void kdist(TreeNode root,int dist){
        if(root==null || vs.contains(root) )return;
        if(root==trgt){
            dist=0;
        }
        if(dist==ideal){
            ans.add(root.val);
        }
        vs.add(root);
        kdist(root.left,dist+1);
        kdist(root.right,dist+1);
       if(hm.containsKey(root)) kdist(hm.get(root),dist+1);
       


    }


    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        trgt = target;
        ideal =k;
        Queue<TreeNode>   q = new LinkedList<>();
        if(root == null)return new ArrayList<>();
        q.add(root);
        hm= new HashMap<>();
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.remove();
                if(curr.left!=null){
                    q.add(curr.left);
                    hm.put(curr.left,curr);}

                if(curr.right!=null){
                    q.add(curr.right);
                    hm.put(curr.right,curr);
                     }
        }
        
    }
    kdist(target,-0);
        return ans;
    }
}