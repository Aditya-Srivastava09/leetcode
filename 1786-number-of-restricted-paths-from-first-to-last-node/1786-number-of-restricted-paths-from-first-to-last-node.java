class Solution {
    static final int MOD=1000000007;
    List<int[]>[] g;
    long[] dist;
    Integer[] dp;

    public int countRestrictedPaths(int n,int[][] edges){
        g=new ArrayList[n+1];
        for(int i=1;i<=n;i++) g[i]=new ArrayList<>();
        for(int[] e:edges){
            g[e[0]].add(new int[]{e[1],e[2]});
            g[e[1]].add(new int[]{e[0],e[2]});
        }
        dijkstra(n);
        dp=new Integer[n+1];
        return dfs(1,n);
    }

    void dijkstra(int n){
        dist=new long[n+1];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[n]=0;

        PriorityQueue<long[]> pq=new PriorityQueue<>((a,b)->Long.compare(a[0],b[0]));
        pq.add(new long[]{0,n});

        while(!pq.isEmpty()){
            long[] cur=pq.poll();
            long d=cur[0];
            int u=(int)cur[1];
            if(d>dist[u]) continue;
            for(int[] e:g[u]){
                int v=e[0];
                long w=e[1];
                if(dist[v]>d+w){
                    dist[v]=d+w;
                    pq.add(new long[]{dist[v],v});
                }
            }
        }
    }

    int dfs(int u,int n){
        if(u==n) return 1;
        if(dp[u]!=null) return dp[u];
        int ans=0;
        for(int[] e:g[u]){
            int v=e[0];
            if(dist[v]<dist[u]){
                ans=(ans+dfs(v,n))%MOD;
            }
        }
        return dp[u]=ans;
    }
}
