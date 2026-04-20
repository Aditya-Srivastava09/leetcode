class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
    int d=  a(nums,k)-a(nums,k-1);
    return d;
          
    }
    public int a(int[] nums,int k){
        int l=0;
        int r=0;
        int count=0;
        int ans=0;
        int n=nums.length;
        while(r<nums.length){
            if(nums[r]%2!=0){
                count++;
            }
            while(count>k){
                if(nums[l]%2!=0){
                    count--;
                }
                l++;
            }
            ans+=(r-l+1);
           
            r++;
        }
        return ans;
    }
}