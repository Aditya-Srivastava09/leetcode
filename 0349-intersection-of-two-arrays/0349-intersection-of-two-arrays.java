class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        
        int idx=0;
         for(int e:nums1){
            set.add(e);
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int l:nums2){
            if(set.contains(l)){
                set2.add(l);
            }
        }
        int[] arr=new int[set2.size()];
        for(int i:set2){
            arr[idx]=i;
            idx++;
        }
        return arr;
    }
}