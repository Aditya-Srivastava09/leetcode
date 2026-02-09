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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        inorder(root,k,a);
        int ans=-1;
        for(int i=0;i<a.size();i++){
            if(i==k-1){
                ans=a.get(i);
                break;
            }
        }


        return ans;
    
    }
    public void inorder(TreeNode root,int k,ArrayList<Integer> a){
        if(root==null){
            return ;

        }
        inorder(root.left,k,a);
        a.add(root.val);
        inorder(root.right,k,a);

    }
}