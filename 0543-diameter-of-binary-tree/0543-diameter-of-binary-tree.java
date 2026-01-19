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
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
         int l=height(root);
         return max;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
       // int max=0;
        int l=height(root.left);
        int r=height(root.right);
        int curdia=l+r;
        max=Math.max(curdia,max);
        
        return 1+Math.max(l,r);



    }
}