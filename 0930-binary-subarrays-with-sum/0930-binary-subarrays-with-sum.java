class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int a=solve(nums,goal)-solve(nums,goal-1);
        return a;
    }
    public int solve(int[] nums,int goal){
      int l=0;
      int r=0;
     if (goal < 0) return 0;

      int sum=0;
      int ans=0;
      while(r<nums.length){
            sum+=nums[r];
        while(sum>goal){
            sum-=nums[l];
            l++;
        }
        ans+=(r-l+1);
        r++;
      }
      return ans;
    }
}