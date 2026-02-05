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
    public TreeNode buildTree(int[] inorder, int[] postorder) {

     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
     }




    TreeNode v= build(inorder,postorder,0,inorder.length-1,0,postorder.length-1,map);
    return v;
    }
    public TreeNode build(int[] inorder,int[] postorder,int ns,int ne,int ps,int pe,HashMap<Integer,Integer> map){
           if(ps>pe || ns>ne){
            return null;
           }
           int val=postorder[pe];
          TreeNode root=new TreeNode(postorder[pe]);
          int pos =map.get(val);
          int l=pos-ns;
          root.left=build(inorder,postorder,ns,pos-1,ps,ps+l-1,map);
          root.right=build(inorder,postorder,pos+1,ne,ps+l,pe-1,map);

        return root;
    }
}