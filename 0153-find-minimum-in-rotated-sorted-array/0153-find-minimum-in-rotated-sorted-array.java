class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int min1=Integer.MAX_VALUE;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[l]<=nums[mid]){
                min1=Math.min(min1,nums[l]);
                l=mid+1;
            }
            else{
                min1=Math.min(min1,nums[mid]);
                h=mid-1;
            }
        }
        return min1;

    }
}