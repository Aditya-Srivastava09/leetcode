import java.util.*;

class Solution {
    public int[] getBiggestThree(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Single cell rhombus
                set.add(grid[i][j]);

                int k = 1;

                while (true) {

                    if (i - k < 0 || i + k >= m || j - k < 0 || j + k >= n) {
                        break;
                    }

                    int total = 0;

                    int r = i - k, c = j;

                    // side 1 (top → right)
                    for (int t = 0; t < k; t++) {
                        total += grid[r + t][c + t];
                    }

                    // side 2 (right → bottom)
                    r = i;
                    c = j + k;
                    for (int t = 0; t < k; t++) {
                        total += grid[r + t][c - t];
                    }

                    // side 3 (bottom → left)
                    r = i + k;
                    c = j;
                    for (int t = 0; t < k; t++) {
                        total += grid[r - t][c - t];
                    }

                    // side 4 (left → top)
                    r = i;
                    c = j - k;
                    for (int t = 0; t < k; t++) {
                        total += grid[r - t][c + t];
                    }

                    set.add(total);
                    k++;
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        int size = Math.min(3, list.size());
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}