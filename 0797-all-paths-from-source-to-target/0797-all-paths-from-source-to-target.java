class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> aa=new ArrayList<>();
        int n=graph.length;
        int[] visited=new int[n];
                path(aa,n,graph,new ArrayList<>(),0);
        return aa;
    }
    public void path(List<List<Integer>> l,int n,int[][] graph,List<Integer> a,int idx){
      a.add(idx);
        if(idx==n-1){
                l.add(new ArrayList<>(a));
                 a.remove(a.size() - 1);   //// backtrack before return

                return;
              }
      for(int e:graph[idx]){
              path(l,n,graph,a,e);

      }
      a.remove(a.size()-1);
    }
}