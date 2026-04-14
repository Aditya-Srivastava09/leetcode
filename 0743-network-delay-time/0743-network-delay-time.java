class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
     List<List<int[]>> a=new ArrayList<>();
     int ni=n;
     for(int i=0;i<ni+1;i++){
        a.add(new ArrayList<>());
     }
     for(int i=0;i<times.length;i++){
        int u=times[i][0];
        int v=times[i][1];
        int w=times[i][2];
        a.get(u).add(new int[]{v,w});
     }
     int [] distance=new int[n+1];
     Arrays.fill(distance,Integer.MAX_VALUE);
     distance[k]=0;
     PriorityQueue<int[]> pq=new PriorityQueue<>((a1,b)->a1[0]-b[0]);
     pq.add(new int[]{0,k});
     while(!pq.isEmpty()){
        int[] arr=pq.poll();
        int currweight=arr[0];
        int currnode=arr[1];
        for(int[] e:a.get(currnode)){
            int nextnode=e[0];
            int nextweight=e[1];
            if(distance[nextnode]>currweight+nextweight){
                  distance[nextnode]=currweight+nextweight;
                  pq.add(new int[]{currweight+nextweight,nextnode});
                   
            }
        }
     }
       int max =0;
        for(int i = 1; i <= n; i++){
            if(distance[i] == Integer.MAX_VALUE) return -1;
            max=Math.max(max, distance[i]);
        }

        return max;

    }
}