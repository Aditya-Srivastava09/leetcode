class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> aa=new ArrayList<>(); 
        List<Integer>  a=new ArrayList<>();
        sub(0,aa,a,target,candidates);
        return aa;
    }
    public void sub(int idx,List<List<Integer>> aa, List<Integer>  a,int target,int[] arr){
        if(idx==arr.length){
            if(target==0){
                aa.add(new ArrayList<Integer>(a));
            }
            return;
        }
        if(arr[idx]<=target){
            a.add(arr[idx]);
            sub(idx,aa,a,target-arr[idx],arr);
            a.remove(a.size()-1);
        }
        sub(idx+1,aa,a,target,arr);
    }

}