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
        List<List<Integer>> aa=new ArrayList<>();
        if(root == null) return aa;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int flag=0;
        while(!q.isEmpty()){
            int x=q.size();
                 List<Integer> a=new ArrayList<>();
            for(int i=0;i<x;i++){
       
            TreeNode d=q.poll();
            if(d.left!=null){
                q.add(d.left);
            }
            if(d.right!=null){
                q.add(d.right);
            }
            if(flag%2==0){
                a.add(d.val);
            }
            else{
                 a.add(0,d.val);
              }
              }
            aa.add(a);
            flag++;
        }
        return aa;
    }
}