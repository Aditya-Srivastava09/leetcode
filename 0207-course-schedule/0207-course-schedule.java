class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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
        List<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int n=q.poll();
            ans.add(n);
            for(int node:a.get(n)){
                indegree[node]--;
                if(indegree[node]==0){
                    q.add(node);
                }
            }
        }
        
        if(ans.size()==numCourses){
            return true;
        }
        return false;

    }
}