class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] result=new int[2];
        Arrays.fill(result,-1);
        int l=0;
        int high=nums.length-1;
        
        while(l<=high){
            int mid=l+(high-l)/2;
            if(nums[mid]==target){
                result[0]=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
         l=0;
         high=nums.length-1;

        while(l<=high){
            int mid=l+(high-l)/2;
            if(nums[mid]==target){
                result[1]=mid;
                l=mid+1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;

    }
}