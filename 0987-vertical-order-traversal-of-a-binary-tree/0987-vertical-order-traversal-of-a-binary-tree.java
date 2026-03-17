class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
        
        dfs(root, map, 0, 0);

        List<List<Integer>> result = new ArrayList<>();

        for (int col : map.keySet()) {
            List<Integer> list = new ArrayList<>();

            TreeMap<Integer, List<Integer>> levels = map.get(col);

            for (int row : levels.keySet()) {
                List<Integer> nodes = levels.get(row);
                
                Collections.sort(nodes); // important for same position
                
                list.addAll(nodes);
            }

            result.add(list);
        }

        return result;
    }

    public void dfs(TreeNode root,
                    TreeMap<Integer, TreeMap<Integer, List<Integer>>> m,
                    int c,
                    int r) {

        if (root == null) return;
        TreeMap<Integer,List<Integer>> p=m.computeIfAbsent(c,k->new TreeMap<>());
        List<Integer> l=p.computeIfAbsent(r,k->new ArrayList<>());
        
        //map.get(col).get(row).add(root.val);
        l.add(root.val);

        dfs(root.left, m, c - 1, r + 1);
        dfs(root.right, m, c + 1, r + 1);
    }
}