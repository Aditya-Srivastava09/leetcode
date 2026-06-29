class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i:arr){
            b.add(i);
        }
        int n=Arrays.stream(arr).max().getAsInt();
        int l=n+k;
        for(int i=1;i<=l;i++){
            if(!b.contains(i)){
                a.add(i);
            }
        }

        return a.get(k-1);
        
    }
}