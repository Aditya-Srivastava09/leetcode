class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] ps=new int[nums.length/2];
        int[] neg=new int[nums.length/2];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                ps[j]=nums[i];
                j++;
            }
            else{
                neg[k]=nums[i];
                k++;
            }
        }
        int[] result=new int[n];
        int l=0;
        for(int i=0;i<result.length/2;i++){
            result[l]=ps[i];
            l++;
            result[l]=neg[i];
            l++;
        }
        return result;
    }
}