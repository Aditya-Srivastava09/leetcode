class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        
        
        PriorityQueue<int []> pq=new PriorityQueue<>((a,b)->a[1]==b[1]?b[0]-a[0]:a[1]-b[1]);
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int a=entry.getKey();
            int b=entry.getValue();
             pq.add(new int[]{a,b});
            
            
            
            
            
            
            
        }
        int[] ans=new int[nums.length];
        int z=0;
        while(!pq.isEmpty()){
          int[] top = pq.poll();
            for (int i = 0; i < top[1]; i++) {
                ans[z]=top[0];
                z++;
            }
            
        }
        return ans;
        
    }
}