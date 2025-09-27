class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;

        long low = 2, high = num / 2;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sq = mid * mid;

            if (sq == num) return true;
            else if (sq < num) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
