class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j,0});
                }
                else if(grid[i][j]==1){
                    count++;
                }
            }
        } 
        if(count==0)return 0;
         int ans = 0;
        int[] n_r = {1, 0, -1, 0};
        int[] n_c = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int l = q.size();
    
            for(int i=0;i<l;i++){
                int[] arr = q.poll();
                int r = arr[0];
                int c = arr[1];
                int t = arr[2];
                ans=Math.max(ans,t);
                for(int j=0;j<4;j++){
                    int nei_row = r + n_r[j];
                    int nei_col = c + n_c[j];
                    if (nei_row >= 0 && nei_row < row && nei_col >= 0 && nei_col < col && grid[nei_row][nei_col] == 1){
                        grid[nei_row][nei_col] = 2; 
                        count--;
                        q.add(new int[]{nei_row, nei_col, t + 1});
                    }
                }
            }
        }
        return count == 0 ? ans : -1;
    }
}