class Solution {
    public int getMaximumGold(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxi = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    maxi = Math.max(maxi, dfs(i, j, grid));
                }
            }
        }
        return maxi;
    }

    public static int dfs(int i, int j, int[][] grid) {
        // Out of bounds or no gold
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
            return 0;

        int gold = grid[i][j];
        grid[i][j] = 0; // mark visited

        int maxGold = 0;
        // Explore all 4 directions
        maxGold = Math.max(maxGold, dfs(i + 1, j, grid));
        maxGold = Math.max(maxGold, dfs(i - 1, j, grid));
        maxGold = Math.max(maxGold, dfs(i, j + 1, grid));
        maxGold = Math.max(maxGold, dfs(i, j - 1, grid));

        grid[i][j] = gold; // backtrack

        return gold + maxGold;
    }
}
