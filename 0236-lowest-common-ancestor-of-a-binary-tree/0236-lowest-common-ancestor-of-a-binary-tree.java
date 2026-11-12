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
    void LCA(TreeNode root,TreeNode p,TreeNode q,List<TreeNode> curr){
        if(root==null)return;
        curr.add(root);
        if(fin.size()==2)return;
        if(p==root || q==root){
            fin.add(new ArrayList<>(curr));
        }
        // if(q==root){
        //     fin.add(new ArrayList<>(curr));
        // }
        LCA(root.left,p,q,curr);
        LCA(root.right,p,q,curr);
        curr.remove(curr.size()-1);
    }
        List<List<TreeNode>> fin ;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        fin = new ArrayList<>();
        LCA(root,p,q, new ArrayList<>());
        List<TreeNode> l1 =fin.get(0);
        List<TreeNode> l2 = fin.get(1);
        HashSet<TreeNode> hs =  new HashSet<>();
        int ptr1 = l1.size()-1;
        int ptr2 =l2.size()-1;
        for(int i=0;i<=ptr1;i++){
            hs.add(l1.get(i));
        }
        for(int i=0;i<=ptr2;i++){
            if (hs.contains(l2.get(ptr2-i)))return (l2.get(ptr2-i));
        }
        return null;

    }
}