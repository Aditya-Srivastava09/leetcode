class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0];
        int pr=0;
        for(int i=0;i<prices.length;i++){
            max=Math.min(max,prices[i]);
            pr=Math.max(pr,prices[i]-max);
        }
        return pr;
    }
}