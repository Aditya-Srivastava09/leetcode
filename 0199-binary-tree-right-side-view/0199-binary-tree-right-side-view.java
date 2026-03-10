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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer>a =new ArrayList<>();
                if(root == null) return a;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            //int s=q.pop();
            for(int i=0;i<n;i++){
              TreeNode d=q.poll();
                if(i==n-1){
                    a.add(d.val);
                }
            
            
            if(d.left!=null){
                q.add(d.left);
            }
            if(d.right!=null){
                q.add(d.right);
            }
          }
        }
        return a;
    }
}