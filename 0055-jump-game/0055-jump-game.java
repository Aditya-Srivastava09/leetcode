class Solution {
    public boolean canJump(int[] nums) {
         int max=0;
         boolean b=true;
        for(int i=0;i<nums.length;i++){
          
           if(i>max){
            b=false;
             break;
           }
            max=Math.max(max,(nums[i]+i));
        }
      
        return b;
    }
}