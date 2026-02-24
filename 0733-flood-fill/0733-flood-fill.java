class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         int m=image.length;
        int n=image[0].length;
         if(image[sr][sc]==color){
          return image;
        }
        boolean[][] v=new boolean[m][n];
        int og=image[sr][sc];
        dfs(image,sr,sc,m,n,color,og,v);
        return image;
    }
    public void dfs(int[][] image,int i,int j,int m,int n,int color,int og,boolean[][]v){
        if(i<0 || j<0 || i>=m || j>=n || image[i][j]!=og) return ;
        v[i][j]=true;
        image[i][j]=color;
        dfs(image,i-1,j,m,n,color,og,v);
        dfs(image,i+1,j,m,n,color,og,v);
        dfs(image,i,j+1,m,n,color,og,v);
        dfs(image,i,j-1,m,n,color,og,v);
    }
}