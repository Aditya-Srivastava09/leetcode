class Solution {
    public double maxProbability(int n,int[][] edges,double[] succProb,int start,int end){
        ArrayList<ArrayList<int[]>> g=new ArrayList<>();
        for(int i=0;i<n;i++) g.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            g.get(u).add(new int[]{v,i});
            g.get(v).add(new int[]{u,i});
        }
        double[] best=new double[n];
        best[start]=1.0;
        PriorityQueue<double[]> pq=new PriorityQueue<>(
            (a,b)->Double.compare(b[1],a[1])
        );
        pq.add(new double[]{start,1.0});
        while(!pq.isEmpty()){
            double[] cur=pq.poll();
            int node=(int)cur[0];
            double prob=cur[1];
            if(node==end) return prob;
            if(prob<best[node]) continue;
            for(int[] e:g.get(node)){
                int next=e[0];
                int idx=e[1];
                double p=prob*succProb[idx];
                if(p>best[next]){
                    best[next]=p;
                    pq.add(new double[]{next,p});
                }
            }
        }
        return 0.0;
    }
}
