class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen=Integer.MAX_VALUE;
        int left=0;
        int right=0;
         int cur=0;
        while(right<nums.length){
             cur+=nums[right];
            while(cur>=target){
                minlen=Math.min(minlen,right-left+1);
                cur-=nums[left];
                left++;
            }
            right++;
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}