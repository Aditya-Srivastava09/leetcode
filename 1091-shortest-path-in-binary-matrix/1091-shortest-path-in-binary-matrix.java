class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return -1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        int[][] distance = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        }
        distance[0][0] = 1;
        int[] dr = {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            if (r == n - 1 && c == n - 1) {
                return distance[r][c];
            }
            for (int i = 0; i < 8; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nc >= 0 && nr < n && nc < n && grid[nr][nc] == 0) {
                    if (distance[r][c] + 1 < distance[nr][nc]) {
                        distance[nr][nc] = distance[r][c] + 1;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
        }
        return -1;
    }
}