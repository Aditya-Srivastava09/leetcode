class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
        }

        int[] visited =new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, visited, graph)){
                 return false;
            }
        }
        return true;
    }

    public boolean dfs(int node, int[] visited, List<List<Integer>> graph) {
        if (visited[node] == 1) return false;
        if (visited[node] == 2) return true;

        visited[node] =1;
        for (int next : graph.get(node)) {
            if (!dfs(next, visited, graph)){
                 return false;
            }
        }

        visited[node] = 2;
        return true;
    }
}
