class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        int count=0;
        boolean[] s=new boolean[v];
        for(int i=0;i<v;i++){
            if(!s[i]){
            dfs(isConnected,i,s);
            count++;
            }
        }
        return count;
    }
    public void dfs(int[][] dd,int i,boolean[] v){
        v[i]=true;
        for(int x=0;x<dd[0].length;x++){
             if(!v[x] && dd[i][x]==1 ){
                dfs(dd,x,v);
             }
        }
    }
}