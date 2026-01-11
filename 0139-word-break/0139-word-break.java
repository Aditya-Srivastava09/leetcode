class Solution {
    Boolean [] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> s1=new HashSet<>(wordDict);
        dp=new Boolean[s.length()];
         return  solve(0,s,dp,s1);

    }
    public Boolean solve(int idx,String s,Boolean[] dp, HashSet<String> s1){
        if(s.length()==idx){
            return true;
        }
        if(dp[idx]!=null) return dp[idx];
        for(int i=idx;i<=s.length();i++){
            if(s1.contains(s.substring(idx,i)) && solve(i,s,dp,s1)){
               return dp[idx]=true;
            }
        }
        return dp[idx]=false;
    }
}