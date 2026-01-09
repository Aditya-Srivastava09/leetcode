class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int c=0;
      int max=Integer.MIN_VALUE;
      if(nums.length==1 && nums[0]==0){
        return 0;
      }
      for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
            c++;
            max=Math.max(c,max);
        }
        if(nums[i]==0){
            c=0;
            max=Math.max(c,max);
        }
      } 
      return max; 
    }
}