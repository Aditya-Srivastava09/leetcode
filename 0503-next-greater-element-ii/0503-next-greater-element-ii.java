class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[nums.length];
        Arrays.fill(arr,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums.length*2;i++){
            int num=nums[i%nums.length];
            while(!st.isEmpty() && nums[st.peek()]<num  ){
                arr[st.pop()]=num;

            }
            if(i<nums.length){
            st.push(i);
            }

        }
        return arr;
    }
}