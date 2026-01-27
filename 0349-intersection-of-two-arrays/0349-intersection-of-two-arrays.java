class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> f=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    f.add(nums1[i]);
                }
            }
        }
        int [] arr=new int[f.size()];
        int i=0;
        for(int e:f){
            arr[i]=e;
            i++;
        }
        return arr;
    }
}