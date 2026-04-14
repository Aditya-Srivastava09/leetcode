import java.util.*;

class Pair {
    int r, c, effort;

    Pair(int r, int c, int effort) {
        this.r = r;
        this.c = c;
        this.effort = effort;
    }
}

class Solution {
    public int minimumEffortPath(int[][] heights) {

        int n = heights.length;
        int m = heights[0].length;

        int[][] distance = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.effort - b.effort);

        pq.add(new Pair(0, 0, 0));
        distance[0][0] = 0;

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while (!pq.isEmpty()) {

            Pair curr = pq.poll();
            int r = curr.r;
            int c = curr.c;
            int effort = curr.effort;

            if (r == n - 1 && c == m - 1) {
                return effort;
            }

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];

                if (nr >= 0 && nc >= 0 && nr < n && nc < m) {

                    int newEffort = Math.max(
                        effort,
                        Math.abs(heights[nr][nc] - heights[r][c])
                    );

                    if (newEffort < distance[nr][nc]) {
                        distance[nr][nc] = newEffort;
                        pq.add(new Pair(nr, nc, newEffort));
                    }
                }
            }
        }

        return 0; 
    }
}