class Solution {
    public int minCostClimbingStairs(int[] cost) {
      int n=cost.length-1;
      int [] arr=new int[n+1];
      Arrays.fill(arr,-1);
      return Math.min(climb(cost,n,arr),climb(cost,n-1,arr));
        
    }
    public static int climb(int[] arr,int n,int [] nums){
        if(n==0){
            return arr[n];
        }
        if(n==1){
            return arr[n];
        }
        if(nums[n]!=-1){
            return nums[n];
        }
    
        nums[n]=arr[n]+Math.min(climb(arr,n-1,nums),climb(arr,n-2,nums));
        int sum=0;
        sum+=nums[n];
        return sum;




    }

}