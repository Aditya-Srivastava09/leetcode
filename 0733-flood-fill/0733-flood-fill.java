class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        boolean[][] v=new boolean[m][n];
        int og=image[sr][sc];
         if(image[sr][sc]==color) return image;
        dfs(sr,sc,m,n,color,image,v,og);
        return image;
    }
    public void dfs(int sr,int sc,int m,int n,int color,int[][] image,boolean[][] v,int og){
        if(sr<0 || sc<0 || sr>=m || sc>=n || image[sr][sc]!=og || v[sr][sc]==true) return;
        v[sr][sc]=true;
        image[sr][sc]=color;
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        for(int i=0;i<4;i++){
            int nr=dr[i]+sr;
            int nc=dc[i]+sc;
            dfs(nr,nc,m,n,color,image,v,og);
        }
    }

}