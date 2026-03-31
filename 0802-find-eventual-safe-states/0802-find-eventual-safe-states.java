class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        List<List<Integer>> rev = new ArrayList<>();
        for(int i = 0; i < n; i++){
            rev.add(new ArrayList<>());
        }

        int[] indegree = new int[n];
        for(int i = 0; i < n; i++){
            for(int node : graph[i]){
                rev.get(node).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);
            for(int node : rev.get(curr)){
                indegree[node]--;
                if(indegree[node] == 0){
                    q.add(node);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}