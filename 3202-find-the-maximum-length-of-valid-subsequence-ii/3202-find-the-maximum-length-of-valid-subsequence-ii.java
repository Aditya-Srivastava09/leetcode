class Solution {
    public int maximumLength(int[] nums,int k){
        int[][] dp=new int[k][k];
        int ans=1;

        for(int x:nums){
            int cur=x%k;
            for(int r=0;r<k;r++){
                int prev=(r-cur+k)%k;
                dp[r][cur]=Math.max(dp[r][cur],dp[r][prev]+1);
                ans=Math.max(ans,dp[r][cur]);
            }
        }
        return ans;
    }
}
