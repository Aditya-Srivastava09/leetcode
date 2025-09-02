class Solution {
    static void cover(int [][] image,int sr,int sc,int rr,int rc,int color,boolean [][]visited,int originalcolor){
      if(sr < 0 || sc < 0 || sr >= rr || sc >= rc || visited[sr][sc] ||!(image[sr][sc] ==originalcolor) ){
        return;
      }
      visited[sr][sc]=true;
      image[sr][sc]=color;
      cover(image,sr,sc+1,rr,rc,color,visited,originalcolor);
      cover(image,sr+1,sc,rr,rc,color,visited,originalcolor);
      cover(image,sr,sc-1,rr,rc,color,visited,originalcolor);
      cover(image,sr-1,sc,rr,rc,color,visited,originalcolor);




    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
          int rr=image.length;
          int rc=image[0].length;
          boolean [][]visited=new boolean[rr][rc];
           int originalcolor = image[sr][sc];
        if (originalcolor == color) return image;

        cover(image,sr,sc,rr,rc,color,visited,originalcolor);
        return image;
     






    }
}