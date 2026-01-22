class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //HashMap<Integer,Integer> map=new Ha
        int[] result=new int[nums2.length];
        int[]  rr=new int[nums1.length];
        Arrays.fill(result,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && nums2[st.peek()]<nums2[i]){
                  result[st.pop()]=nums2[i];
            }
            st.push(i);
        }
        int idx=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    rr[idx]=result[j];
                    idx++;
                }
            }
        }
        return rr;
    }
}