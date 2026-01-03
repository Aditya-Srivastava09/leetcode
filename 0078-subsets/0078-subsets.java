class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        List<Integer> a1=new ArrayList<>();
         subsets1(0,nums,a,a1);
         return a;

    }
    public static void subsets1(int x,int[] nums,List<List<Integer>> a,List<Integer> a1){
        int n=nums.length;
        if(x==n){
            a.add(new ArrayList<>(a1));
            return;
        }
        a1.add(nums[x]);
        subsets1(x+1,nums,a,a1);
        a1.remove(a1.size()-1);
        subsets1(x+1,nums,a,a1);
    }
}