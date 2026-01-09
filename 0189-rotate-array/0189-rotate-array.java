class Solution {
    public void rotate(int[] nums, int k) {
       // ArrayList<Integer> a=new ArrayList<>();
       int n=nums.length;
        k = k % n;
        int[] og=new int[n-k];
        int[] ne=new int[k];
        
        for(int i=0;i<nums.length-k;i++){
            og[i]=nums[i];
        }
        for(int i=n-k;i<nums.length;i++){
            ne[i-(n-k)]=nums[i];
        }
         for(int i=0;i<k;i++){
            nums[i]=ne[i];
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=og[i-k];
        }
       

    }
}