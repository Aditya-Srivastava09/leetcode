class Solution{
    public int countHousePlacements(int n){
        int mod=1_000_000_007;
        long[] dp=new long[n+1];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%mod;
        }
        long oneSide=dp[n];
        return (int)((oneSide*oneSide)%mod);
    }
}
