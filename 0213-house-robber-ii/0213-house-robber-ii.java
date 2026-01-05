class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n-1];
        int[] arr2=new int[n-1];
        if(n==1) return nums[0];
       for(int i=0;i<n-1;i++){
            arr1[i]=nums[i+1];
            arr2[i]=nums[i];
        }
        int[] dp1=new int[n-1];
        int[] dp2=new int[n-1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);

       return Math.max(sub(n-2,arr1,dp1),sub(n-2,arr2,dp2));
    }
    public int sub(int n,int[] nums,int[] dp){
        if(n==0) return nums[0];
        if(n<0)  return 0;
        if(dp[n]!=-1) {
            return dp[n];
        }
        int pick=nums[n]+sub(n-2,nums,dp);
        int np=0+sub(n-1,nums,dp);
        dp[n]=Math.max(pick,np);
        return dp[n];
    }
}