class Solution {
    public int[] singleNumber(int[] nums) {
        int [] arr=new int[2];
        ArrayList<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();                              
        for(int i=0;i<nums.length;i++){
              map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        for(int e:map.keySet()){
            if(map.get(e)==1){
                a.add(e);
            }
        }
        for(int i=0;i<a.size();i++){
            arr[i]=a.get(i);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
}