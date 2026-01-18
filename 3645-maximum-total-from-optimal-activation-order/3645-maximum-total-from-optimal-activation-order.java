class Solution {
    public long maxTotal(int[] value, int[] limit) {
        int n = value.length;

        Queue<int []> q = new PriorityQueue<>((a,b)->{
            if (a[1] != b[1])
                return a[1] - b[1];         
            return b[0] - a[0]; 
        });

        for(int i=0;i<n;i++)
            q.offer(new int[]{value[i],limit[i]});
        
        long ans = 0L;
        int x = 0;

        int map[] = new int[n+1];
        Set<Integer> inactive = new HashSet<>();

        while(!q.isEmpty()){
            int arr[] = q.poll();
            if(!inactive.contains(arr[1]) && arr[1] > x){
                ans += (long)arr[0];
                x++;
                map[arr[1]]++;

                int ind = x;
                inactive.add(x);
                x -= map[ind];
                map[ind] = 0;
            }

        }
        
        return ans;
    }
}