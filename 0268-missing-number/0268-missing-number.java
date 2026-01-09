class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        int a=nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                ans=i;
                return ans;
            }
        }



     return a+1;

    }
}