class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<nums.length;i++){
         while (nums[i]>0 && nums[i]<=n && nums[nums[i]-1]!= nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }


        }
        int index=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=index){
                return index;
            }
            index++;
        }
        return nums.length+1;
    }
}