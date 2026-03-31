class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<ArrayList<Integer>> a=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            a.add(new ArrayList<>());
        }
        int[] indegree=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            a.get(v).add(u);
            indegree[u]++;
        }
        int[] arr=new int[numCourses];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int idx=0;
        while(!q.isEmpty()){
            int n=q.poll();
            arr[idx]=n;
            idx++;
            for(int node:a.get(n)){
                indegree[node]--;
                if(indegree[node]==0){
                    q.add(node);
                }
            }
        }
       if(idx==numCourses){
        return arr;
       }
       return new int[0];

    }
}