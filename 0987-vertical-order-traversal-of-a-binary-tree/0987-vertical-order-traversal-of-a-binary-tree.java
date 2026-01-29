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
 class Tuple{
    TreeNode node;
    int vertical;
    int level;
    public Tuple(TreeNode node,int vertical,int level){
        this.node=node;
        this.vertical=vertical;
        this.level=level;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> aa=new ArrayList<>();
        Queue<Tuple> q=new LinkedList<>();
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple p=q.poll();
            TreeNode node=p.node;
            int v=p.vertical;
            int l=p.level;
            if(!map.containsKey(v)){
                map.put(v,new TreeMap<>());
            }
            if(!map.get(v).containsKey(l)){
                map.get(v).put(l,new PriorityQueue<>());
            }
            map.get(v).get(l).offer(node.val);
            if(node.left!=null){
                q.offer(new Tuple(node.left,v-1,l+1));
            }
            if(node.right!=null){
                q.offer(new Tuple(node.right,v+1,l+1));
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> pq:map.values()){
            List<Integer> l=new ArrayList<>();
            for(PriorityQueue<Integer> qr:pq.values()){
                while(!qr.isEmpty()){
                    l.add(qr.poll());

                }
            
            } 
            aa.add(l);
        }
        return aa;

    }
}