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
    List<TreeNode> a=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        
        for(int a:to_delete){
            s.add(a);
        }
        del(root,true);
        return a;
    }
    public TreeNode  del(TreeNode root,boolean isroot){
        if(root==null) return null;
        boolean deleted=s.contains(root.val);
        if(isroot  && !deleted){
              a.add(root);
        }
         
        root.left=del(root.left,deleted);
        root.right=del(root.right,deleted);


       return deleted?null:root;

    }
}