class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int up = dp[i - 1][j];
                int left = j > 0 ? dp[i - 1][j - 1] : Integer.MAX_VALUE;
                int right = j < n - 1 ? dp[i - 1][j + 1] : Integer.MAX_VALUE;
                dp[i][j] = matrix[i][j] + Math.min(up, Math.min(left, right));
            }
        }
        int answer = dp[m - 1][0];
        for (int j = 1; j < n; j++) {
            answer = Math.min(answer, dp[m - 1][j]);
        }
        return answer;
    }
}
