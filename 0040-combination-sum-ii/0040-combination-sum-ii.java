class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> aa=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        Arrays.sort(candidates);
        sub(aa,a,candidates,0,target);
        return aa;
    }
    public void sub(List<List<Integer>> aa,List<Integer> a,int[] arr,int idx,int target){
        if(target==0){
            aa.add(new ArrayList<>(a));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            if(arr[i]>target) break;
            if(i>idx && arr[i]==arr[i-1]){
               continue;
            }
            a.add(arr[i]);
            sub(aa,a,arr,i+1,target-arr[i]);
            a.remove(a.size()-1);
        }

    }
}