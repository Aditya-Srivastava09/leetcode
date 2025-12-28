class Solution{
    public int minimumSubarrayLength(int[] nums,int k){
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int or=0;
            for(int j=i;j<nums.length;j++){
                or=or|nums[j];
                if(or>=k){
                    int len=j-i+1;
                   if(ans==-1||len<ans){
                        ans=len;
                    }
                    break;
                }
            }
        }
        return ans;
    }
}
