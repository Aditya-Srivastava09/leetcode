import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> even = new HashMap<>();
        Map<Integer, Integer> odd = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                even.put(nums[i], even.getOrDefault(nums[i], 0) + 1);
            else
                odd.put(nums[i], odd.getOrDefault(nums[i], 0) + 1);
        }

        int[][] e = topTwo(even);
        int[][] o = topTwo(odd);

        if (e[0][0] != o[0][0]) {
            return n - e[0][1] - o[0][1];
        }

        int option1 = n - e[0][1] - o[1][1];
        int option2 = n - e[1][1] - o[0][1];

        return Math.min(option1, option2);
    }

    private int[][] topTwo(Map<Integer, Integer> map) {
        int[][] res = {{-1, 0}, {-1, 0}};

        for (var entry : map.entrySet()) {
            int val = entry.getKey();
            int cnt = entry.getValue();

            if (cnt > res[0][1]) {
                res[1] = res[0];
                res[0] = new int[]{val, cnt};
            } else if (cnt > res[1][1]) {
                res[1] = new int[]{val, cnt};
            }
        }

        return res;
    }
}
