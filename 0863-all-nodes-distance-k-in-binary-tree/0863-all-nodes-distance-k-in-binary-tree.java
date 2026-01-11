class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        buildParent(root, parent);

        
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> vis = new HashSet<>();

        q.offer(target);
        vis.add(target);

        int dist = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            if (dist == k) {
                List<Integer> ans = new ArrayList<>();
                for (TreeNode node : q) {
                    ans.add(node.val);
                }
                return ans;
            }

            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();

                if (cur.left != null && vis.add(cur.left)) {
                    q.offer(cur.left);
                }
                if (cur.right != null && vis.add(cur.right)) {
                    q.offer(cur.right);
                }
                if (parent.get(cur) != null && vis.add(parent.get(cur))) {
                    q.offer(parent.get(cur));
                }
            }
            dist++;
        }

        return new ArrayList<>();
    }

    private void buildParent(TreeNode root, HashMap<TreeNode, TreeNode> parent) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode cur = q.poll();

            if (cur.left != null) {
                parent.put(cur.left, cur);
                q.offer(cur.left);
            }
            if (cur.right != null) {
                parent.put(cur.right, cur);
                q.offer(cur.right);
            }
        }
    }
}
