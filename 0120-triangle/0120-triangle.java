import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        return dfs(0, 0, triangle, dp);
    }

    private int dfs(int i, int j, List<List<Integer>> triangle, int[][] dp) {
        if(i == triangle.size() - 1){
            return triangle.get(i).get(j);
        }

        if(dp[i][j] != Integer.MAX_VALUE){
            return dp[i][j];
        }

        int down = dfs(i + 1, j, triangle, dp);
        int diag = dfs(i + 1, j + 1, triangle, dp);

        dp[i][j] = triangle.get(i).get(j) + Math.min(down, diag);
        return dp[i][j];
    }
}
