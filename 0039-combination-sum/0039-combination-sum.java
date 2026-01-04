class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        sub(candidates,target,l,a,0);
        return l;
    }
    public void sub(int [] arr,int target,List<List<Integer>> l,List<Integer> a,int i){
        if(i==arr.length){
            if(target==0){
                l.add(new ArrayList<>(a));
            }
            return;
        }
        if(arr[i]<=target){
            a.add(arr[i]);
            sub(arr,target-arr[i],l,a,i);
            a.remove(a.size()-1);
        }
        sub(arr,target,l,a,i+1);
    }
}