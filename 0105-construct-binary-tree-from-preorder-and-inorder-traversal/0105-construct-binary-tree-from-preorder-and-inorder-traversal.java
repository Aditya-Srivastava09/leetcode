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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
       TreeNode r= build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
       return r;
    }
    public TreeNode build(int[] preorder,int ps,int pe,int[] inorder,int ns,int ne,HashMap<Integer,Integer> map){
          if(ps>pe || ns>ne){
            return null ;
          }
          int v=preorder[ps];
          TreeNode root=new TreeNode(v);
        int pos=map.get(preorder[ps]);
        int left=pos-ns;
        root.left=build(preorder,ps+1,ps+left,inorder,ns,pos-1,map);
        root.right=build(preorder,ps+left+1,pe,inorder,pos+1,ne,map);
         return root;
    }





}