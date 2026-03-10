class Solution{
    public int maxProfit(int[] prices){
        int n=prices.length;
        int[][] dp=new int[n][2];
        for(int i=0;i<n;i++){
            dp[i][0]=-1;
            dp[i][1]=-1;
        }
        return recursion(prices,0,0,dp);
    }
    public int recursion(int[] prices,int idx,int buy,int[][] dp){
        if(idx>=prices.length){
            return 0;
        }
        if(dp[idx][buy]!=-1){
            return dp[idx][buy];
        }
        if(buy==0){
            int take=recursion(prices,idx+1,1,dp)-prices[idx];
            int skip=recursion(prices,idx+1,0,dp);
            dp[idx][buy]=Math.max(take,skip);
        }
        else{
            int take=recursion(prices,idx+2,0,dp)+prices[idx];
            int skip=recursion(prices,idx+1,1,dp);
            dp[idx][buy]=Math.max(take,skip);
        }
        return dp[idx][buy];
    }
}