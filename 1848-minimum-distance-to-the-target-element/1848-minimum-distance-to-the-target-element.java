class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        
        int a=Integer.MAX_VALUE;
        for(int i=start;i<nums.length;i++){
              if(nums[i]==target){
                int ad=Math.abs(start-i);
                a=Math.min(a,ad);
              }
        }
        for(int i=start-1;i>0;i--){
              if(nums[i]==target){
                int ad=Math.abs(start-i);
                a=Math.min(a,ad);
              }
        }
        if(a==Integer.MAX_VALUE){
            return start;
        }
        return a;
    }
}