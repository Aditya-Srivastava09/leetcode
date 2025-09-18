class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int maxlength=0;
        int zeros=0;
        while(r<nums.length){
            if(nums[r]==0){
                  zeros++;
            }
            if(zeros>k){
               while(zeros>k){
                   if(nums[l]==0){
                    zeros--;
                   }
                   l++;
               }

            }
            if(zeros<=k){
                int len=r-l+1;
                maxlength=Math.max(maxlength,len);
                r++;
            }
        }
        return maxlength;
    }
}