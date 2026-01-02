import java.util.*;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> a=new ArrayList<>();
        int v=isConnected.length;

        for(int i=0;i<v;i++){
            a.add(new ArrayList<>());
        }

        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(isConnected[i][j]==1 && i!=j){
                    a.get(i).add(j);
                    a.get(j).add(i);
                }
            }
        }

        int count=0;
        int[] vi=new int[v];

        for(int i=0;i<v;i++){
            if(vi[i]==0){
                dfs(i,a,vi);
                count++;
            }
        }
        return count;
    }

    void dfs(int node,List<List<Integer>> a,int[] vi){
        vi[node]=1;
        for(int nei:a.get(node)){
            if(vi[nei]==0){
                dfs(nei,a,vi);
            }
        }
    }
}
