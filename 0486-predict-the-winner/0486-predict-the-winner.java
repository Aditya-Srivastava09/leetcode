class Solution {
    public boolean predictTheWinner(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int[][] memo=new int[nums.length][nums.length];
        return helper(l,r,nums,memo)>=0;
    }
    public static int helper(int l,int r,int[] nums,int[][] memo){
        if(l==r) return nums[l];
        if(memo[l][r]!=0) return memo[l][r];
        int le=nums[l]-helper(l+1,r,nums,memo);
        int re=nums[r]-helper(l,r-1,nums,memo);
        memo[l][r]=Math.max(le,re);
        return memo[l][r];
    }
}