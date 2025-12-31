class Solution {
    public boolean validPath(int n,int[][] edges,int source,int destination){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        return bfs(adj,source,destination,n);
    }

    public boolean bfs(ArrayList<ArrayList<Integer>> adj,int source,int destination,int n){
        boolean[] vis=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        vis[source]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            if(node==destination){
                return true;
            }
            for(int nei:adj.get(node)){
                if(!vis[nei]){
                    vis[nei]=true;
                    q.add(nei);
                }
            }
        }
        return false;
    }
}
