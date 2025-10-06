class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] x=new boolean[nums.length];
        helper(nums,a,ans,x);
        return a;
    }
    public static void helper(int[] nums, List<List<Integer>> a,ArrayList<Integer> ans,boolean[] x){
        if(ans.size()==nums.length){
            a.add(new ArrayList<>(ans));
        }
        for(int i=0;i<nums.length;i++){
            if(x[i]!=true){
                x[i]=true;
                ans.add(nums[i]);
                helper(nums,a,ans,x);
                ans.remove(ans.size()-1);
                helper(nums,a,ans,x);
                x[i]=false;

            }
        }
    }
}