class Solution {
    public void nextPermutation(int[] nums) {
        int breakp = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakp = i;
                break;
            }
        }
        if (breakp == -1) {
            int i = 0;
            int j = nums.length - 1;

            while (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            return;
        }

        int s = -1;
        for (int i = nums.length - 1; i > breakp; i--) {
            if (nums[i] > nums[breakp]) {
                s = i;
                break;
            }
        }
        int temp = nums[breakp];
        nums[breakp] = nums[s];
        nums[s] = temp;
        int i = breakp + 1;
        int j = nums.length - 1;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}