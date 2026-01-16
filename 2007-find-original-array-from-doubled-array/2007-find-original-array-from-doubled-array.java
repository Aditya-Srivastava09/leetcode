import java.util.*;

class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) return new int[0];
        TreeMap<Integer, Integer> freq = new TreeMap<>();
        for (int x : changed) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        int[] original = new int[n / 2];
        int idx = 0;
        for (int x : freq.keySet()) {
            int count = freq.get(x);
            if (count == 0) continue;
            int doubled = x * 2;
            if (!freq.containsKey(doubled)) return new int[0];
            if (x == 0) {
                if (count % 2 != 0) return new int[0];
                for (int i = 0; i < count / 2; i++) {
                    original[idx++] = 0;
                }
            } else {
                if (freq.get(doubled) < count) return new int[0];
                for (int i = 0; i < count; i++) {
                    original[idx++] = x;
                }
                freq.put(doubled, freq.get(doubled) - count);
            }
        }
        return idx == n / 2 ? original : new int[0];
    }
}
