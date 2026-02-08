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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode prev=new TreeNode(0);
         TreeNode n=new TreeNode(val);
          TreeNode temp=root;
         while(temp!=null){
            prev=temp;
            if(n.val<temp.val){
                
                temp=temp.left;
            }
            else{
                temp=temp.right;
            }
         }
         if(prev.val<n.val){
            prev.right=n;
         }
         else{
            prev.left=n;
         }

         
        return root;
    }
}