class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int ans=0;
        for(int i=0;i<satisfaction.length;i++){
            int d=0;
            d+=satisfaction[i]*1;
            int dd=2;
          for(int j=i+1;j<satisfaction.length;j++){
               d+=satisfaction[j]*dd;
               dd++;

          }
        ans=  Math.max(ans,d);
        }
         return ans;
    }
}