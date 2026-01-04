class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> aa=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        Arrays.sort(nums);
        sub(aa,a,nums,0);
        return aa;
    }
    public void sub(List<List<Integer>> aa,List<Integer> a,int[] nums,int idx){
       // if(idx==nums.length){
            aa.add(new ArrayList<>(a));
           // return;
        
            for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            a.add(nums[i]);
            sub(aa,a,nums,i+1);
            a.remove(a.size()-1);
        }


    }
}