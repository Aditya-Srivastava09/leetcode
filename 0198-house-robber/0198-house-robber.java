class Solution {
    public int rob(int[] nums) {
        int n=nums.length-1;
         int [] arr=new int[n+1];
         Arrays.fill(arr,-1);
       return  sum(nums,n,arr);
    }
      public static int sum(int [] arr,int n,int [] nums){
           if(n==0){
               return arr[n];
           }
           if(n==1){
               return Math.max(arr[n],arr[n-1]);
           }
           if(nums[n]!=-1){
               return nums[n];
           }
           
           nums[n]=Math.max((arr[n]+sum(arr,n-2,nums)),sum(arr,n-1,nums));
           return nums[n];
    }
}