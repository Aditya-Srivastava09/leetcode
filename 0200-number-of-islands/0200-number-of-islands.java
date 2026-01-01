class Solution {
    public int numIslands(char[][] grid) {
       int[] dr={-1,1,0,0};
       int[] dc={0,0,-1,1};
       int m=grid.length;
       int n=grid[0].length;
       boolean [][] visited=new boolean[m][n]; 
       int count=0;
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(!visited[i][j] && grid[i][j]=='1'){
                 dfs(i,j,grid,visited);
                 count++;
            }
        }
       }
       return count;
    }
    public void dfs(int i,int j,char[][] mat,boolean[][] v){
        if(i<0||j<0||i>=mat.length||j>=mat[0].length) return;
        if(v[i][j]||mat[i][j]=='0') return;
        v[i][j]=true;
        dfs(i-1,j,mat,v);
         dfs(i+1,j,mat,v);
          dfs(i,j-1,mat,v);
           dfs(i,j+1,mat,v);

    }


}