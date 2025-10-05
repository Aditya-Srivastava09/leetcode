class Solution{
    public int maxSubArray(int[] nums){
       // int sum=0;
        int cur=0;
        int maxsum=nums[0];
        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
            maxsum=Math.max(cur,maxsum);
            if(cur<0) cur=0;
        }
        return maxsum;

    }
}
