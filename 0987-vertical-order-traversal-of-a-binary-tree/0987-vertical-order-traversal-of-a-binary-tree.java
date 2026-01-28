class three {
    TreeNode rr;
    int v; 
    int l;

    public three(TreeNode rr, int v, int l) {
        this.rr = rr;
        this.v = v;
        this.l = l;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<three> q = new LinkedList<>();
        q.offer(new three(root, 0, 0));

        while (!q.isEmpty()) {
            three p = q.poll();
            TreeNode n = p.rr;
            int x = p.v; 
            int y = p.l; 

            map.putIfAbsent(x, new TreeMap<>());
            map.get(x).putIfAbsent(y, new PriorityQueue<>());
            map.get(x).get(y).offer(n.val);

            if (n.left != null) {
                q.offer(new three(n.left, x - 1, y + 1));
            }
            if (n.right != null) {
                q.offer(new three(n.right, x + 1, y + 1));
            }
        }

        List<List<Integer>> result = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> column = new ArrayList<>();
            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) {
                    column.add(pq.poll());
                }
            }
            result.add(column);
        }

        return result;
    }
}
