class Solution{
    public int findCircleNum(int[][] isConnected){
        int v=isConnected.length;
        boolean[] visited=new boolean[v];
        int count=0;

        for(int i=0;i<v;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                count++;
            }
        }
        return count;
    }

    public void dfs(int i,int[][] a,boolean[] visited){
        visited[i]=true;
        for(int nbr=0;nbr<a.length;nbr++){
            if(a[i][nbr]==1 && !visited[nbr]){
                dfs(nbr,a,visited);
            }
        }
    }
}
