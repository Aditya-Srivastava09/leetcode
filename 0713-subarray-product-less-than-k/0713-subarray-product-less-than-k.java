class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int count=0;
        int pro=1;
        if (k <= 1) return 0;

        for(int r=0;r<nums.length;r++){
            pro*=nums[r];
            while(pro>=k){
                pro/=nums[l];
                l++;
            }
            count+=r-l+1;
        }
        return count;
    }
}