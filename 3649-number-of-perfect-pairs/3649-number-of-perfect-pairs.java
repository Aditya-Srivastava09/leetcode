class Solution{
    public long perfectPairs(int[] nums){
        int n=nums.length;
        long[] a=new long[n];
        int m=0;
        long z=0;
        for(int x:nums){
            if(x==0)z++;
            else a[m++]=Math.abs((long)x);
        }
        Arrays.sort(a,0,m);
        long res=z*(z-1)/2;
        int r=0;
        for(int l=0;l<m;l++){
            if(r<l)r=l;
            while(r+1<m&&a[r+1]<=2*a[l]){
                r++;
            }
            res+=r-l;
        }
        return res;
    }
}
