class Solution {
    public static void bfs(char[][] grid, int i, int j, int row, int col, boolean[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        visited[i][j] = true;

        int[] n_r = {1, 0, -1, 0};
        int[] n_c = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            int[] arr = q.poll();
            int r = arr[0];
            int c = arr[1];

            for (int k = 0; k < 4; k++) {
                int nei_row = r + n_r[k];
                int nei_col = c + n_c[k];

                if (nei_row >= 0 && nei_row < row && nei_col >= 0 && nei_col < col
                        && grid[nei_row][nei_col] == '1' && !visited[nei_row][nei_col]) {
                    visited[nei_row][nei_col] = true;
                    q.add(new int[]{nei_row, nei_col});
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(grid, i, j, row, col, visited);
                    count++;
                }
            }
        }
        return count;
    }
}