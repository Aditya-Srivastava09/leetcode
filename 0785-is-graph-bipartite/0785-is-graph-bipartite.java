class Solution {
    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        int[] color = new int[v];
        Arrays.fill(color, -1);

        for (int i = 0; i < v; i++) {
            if (color[i] == -1) {
                if (!bfs(color, graph, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean bfs(int[] color, int[][] graph, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        color[start] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int neigh : graph[node]) {
                if (color[neigh] == -1) {
                    color[neigh] = 1 - color[node];
                    q.add(neigh);
                } 
                else if (color[neigh] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}
