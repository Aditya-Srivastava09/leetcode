class Solution {
    public int makeConnected(int n, int[][] connections) {
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<connections.length;i++){
            int u=connections[i][0];
            int v=connections[i][1];
            l.get(u).add(v);
            l.get(v).add(u);
        }
        int c=0;
        int[] visited=new int[n];
        for(int i=0;i<l.size();i++){
            if(visited[i]==0){
                dfs(i,l,visited);
                c++;
            }
        }
        int length=connections.length;
        if(length<n-1){
            return -1;
        }
        return c-1;
    }
    public void dfs(int node,List<List<Integer>> a,int[] vis){
           vis[node]=1;
           for(int n:a.get(node)){
              if(vis[n]==0){
                dfs(n,a,vis);
              }
           }
    }
}