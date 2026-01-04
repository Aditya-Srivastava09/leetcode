class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> aa=new ArrayList<>();
        List<Integer>  a=new ArrayList<>();
        sub(0,aa,a,nums);
        return aa;
    }
    public void sub(int i,List<List<Integer>> aa,List<Integer> a,int [] arr){
        if(i==arr.length){
            aa.add(new ArrayList(a));
            return;
        }
        a.add(arr[i]);
        sub(i+1,aa,a,arr);
        a.remove(a.size()-1);
        sub(i+1,aa,a,arr);
    }
}