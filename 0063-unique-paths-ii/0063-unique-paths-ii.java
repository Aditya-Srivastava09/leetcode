class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        
        return sub(m-1,n-1,dp,obstacleGrid);
        
    }
    public int sub(int m,int n,int[][]dp,int[][] arr){
        
         if(m==0 && n==0 && arr[m][n]!=1) return 1;
         if(m<0 || n<0) return 0;
         if(arr[m][n]==1) return 0;
         if(dp[m][n]!=-1) return dp[m][n];
         int left=sub(m-1,n,dp,arr);
         int right=sub(m,n-1,dp,arr);
         dp[m][n]=left+right;
          return dp[m][n]; 
    }
   
}