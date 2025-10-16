class Solution {
    public void moveZeroes(int[] nums) {
        int[] per=new int[nums.length];
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            per[x++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=per[i];
        }
    }
}