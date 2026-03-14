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
class pair{
    TreeNode n;
    int d;
    pair(TreeNode n,int d){
        this.n=n;
        this.d=d;
    }
}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(root,0));
        int width=0;
        while(!q.isEmpty()){
            int n=q.size();
              int first=q.peek().d;
               int last=-1;
            for(int i=0;i<n;i++){
                pair p=q.poll();
                TreeNode node=p.n;
                int idx=p.d;
                last=idx;
               
                if(node.left!=null){
                     q.add(new pair(node.left,(2*idx)+1));
                }
                if(node.right!=null){
                    q.add(new pair(node.right,(2*idx)+2));

                }
            }
            width=Math.max(width,(last-first)+1);

        }
        return width;

    }
}