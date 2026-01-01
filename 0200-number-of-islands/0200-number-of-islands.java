class Solution {
    public int numIslands(char[][] grid) {
       int[] dr={-1,1,0,0};
       int[] dc={0,0,-1,1};
       int m=grid.length;
       int n=grid[0].length;
       int count=0;
       boolean[][] vis=new boolean[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(!vis[i][j] && grid[i][j]=='1'){
                 dfs(i,j,grid,vis);
                 count++;
            }
        }
       }
       return count;
    }
     void dfs(int i,int j,char[][] grid,boolean[][] vis){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length) return;
        if(vis[i][j]||grid[i][j]=='0') return;

        vis[i][j]=true;

        dfs(i+1,j,grid,vis);
        dfs(i-1,j,grid,vis);
        dfs(i,j+1,grid,vis);
        dfs(i,j-1,grid,vis);
    }
     
}