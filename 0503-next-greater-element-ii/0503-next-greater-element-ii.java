class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] res=new int[nums.length];
        //int  i=0;
        int n=nums.length;
        for(int i=2*nums.length-1;i>=0;i--){
            int idx=i%n;
            while(!st.isEmpty() && st.peek()<=nums[idx]){
                st.pop();
            }
            res[idx]=st.isEmpty()?-1:st.peek();
            
            st.push(nums[idx]);
            
            //i++;

        }
        return res;
    }
}