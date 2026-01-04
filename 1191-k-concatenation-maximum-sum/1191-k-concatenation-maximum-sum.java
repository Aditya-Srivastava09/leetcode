class Solution{
    public int kConcatenationMaxSum(int[] arr,int k){
        int mod=1000000007;
        long total=0,pref=0,maxPref=0;

        for(int x:arr){
            total+=x;
            pref+=x;
            maxPref=Math.max(maxPref,pref);
        }

        long suff=0,maxSuff=0;
        for(int i=arr.length-1;i>=0;i--){
            suff+=arr[i];
            maxSuff=Math.max(maxSuff,suff);
        }

        long cur=0,kadane=0;
        for(int x:arr){
            cur=Math.max(x,cur+x);
            kadane=Math.max(kadane,cur);
        }

        if(k==1)return(int)(kadane%mod);

        long ans;
        if(total>0){
            ans=maxSuff+maxPref+(k-2)*total;
        }else{
            ans=maxSuff+maxPref;
        }

        ans=Math.max(ans,kadane);
        return(int)(ans%mod);
    }
}
