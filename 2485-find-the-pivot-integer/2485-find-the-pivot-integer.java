class Solution {
    public int pivotInteger(int n) {
        int[] prefix=new int[n+1];
        prefix[0]=0;
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+i;
        }
        int[] suffix=new int[n+1];
        suffix[n]=n;
        for(int j=n-1;j>=0;j--){
            suffix[j]=suffix[j+1]+j;
        }
        int ans=0;
         for(int i=0;i<prefix.length;i++){
            if(prefix[i]==suffix[i]){
                return i;
            }
        }
        return -1;

    }
}