class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)return -1;
        int l=1;
        int max=bloomDay[0];
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
        }
        int h=max;
        //int ans=-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(can(bloomDay,m,k,mid)){
               // ans=mid;
                h=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean can(int[] arr,int m,int k ,int mid){
            int n=m*k;
            int b=0;
            int f=0;
            for(int i=0;i<arr.length;i++){
                 if(arr[i]<=mid){
                     f++;
                     if(k==f){
                        f=0;
                        b++;
                     }

                 }
                 else{
                    f=0;
                 }
            }
        return b>=m?true:false;
    }
}