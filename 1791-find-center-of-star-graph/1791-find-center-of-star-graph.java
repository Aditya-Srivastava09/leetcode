class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;
        int[] deg=new int[n+1];

        for(int[] e:edges){
            deg[e[0]]++;
            deg[e[1]]++;
        }

        for(int i=1;i<=n;i++){
            if(deg[i]==n-1) return i;
        }
        return -1;
    }
}
