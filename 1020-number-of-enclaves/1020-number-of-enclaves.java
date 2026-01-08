class Pair {
    int i, j;
    Pair(int i, int j) {
        this.i = i;
        this.j = j;
    }
}

class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] vis = new boolean[m][n];
        Queue<Pair> q = new LinkedList<>();

        // Add boundary land cells
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 1) {
                q.add(new Pair(i, 0));
                vis[i][0] = true;
            }
            if (grid[i][n - 1] == 1) {
                q.add(new Pair(i, n - 1));
                vis[i][n - 1] = true;
            }
        }

        for (int j = 0; j < n; j++) {
            if (grid[0][j] == 1) {
                q.add(new Pair(0, j));
                vis[0][j] = true;
            }
            if (grid[m - 1][j] == 1) {
                q.add(new Pair(m - 1, j));
                vis[m - 1][j] = true;
            }
        }

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        // BFS
        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int d = 0; d < 4; d++) {
                int ni = p.i + dx[d];
                int nj = p.j + dy[d];

                if (ni >= 0 && nj >= 0 && ni < m && nj < n &&
                    grid[ni][nj] == 1 && !vis[ni][nj]) {

                    vis[ni][nj] = true;
                    q.add(new Pair(ni, nj));
                }
            }
        }

        // Count enclaves
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
