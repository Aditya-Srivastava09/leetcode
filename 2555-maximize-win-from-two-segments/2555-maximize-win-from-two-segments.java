class Solution{
    public int maximizeWin(int[] prizePositions,int k){
        int n=prizePositions.length;
        int[] cnt=new int[n];

        int l=0;
        for(int r=0;r<n;r++){
            while(prizePositions[r]-prizePositions[l]>k){
                l++;
            }
            cnt[r]=r-l+1;
        }

        int[] best=new int[n];
        best[0]=cnt[0];
        for(int i=1;i<n;i++){
            best[i]=Math.max(best[i-1],cnt[i]);
        }

        int ans=0;
        for(int i=0;i<n;i++){
            int prevIndex=i-cnt[i];
            int first=prevIndex>=0?best[prevIndex]:0;
            ans=Math.max(ans,first+cnt[i]);
        }

        return ans;
    }
}
