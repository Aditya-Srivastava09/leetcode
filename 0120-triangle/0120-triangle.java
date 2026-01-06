class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int a=triangle.size();
        int[][] dp=new int[a][a];
        for(int i=0;i<a;i++){
            Arrays.fill(dp[i], -1);
        }
        return sub(triangle,0,0,dp);
    }

    public int sub(List<List<Integer>> triangle,int i,int j,int[][]dp){
        if(i==triangle.size()-1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int a=triangle.get(i).get(j)+sub(triangle,i+1,j,dp);
        int b=triangle.get(i).get(j)+sub(triangle,i+1,j+1,dp);
        dp[i][j]=Math.min(a,b);
        return dp[i][j];
    }
}
