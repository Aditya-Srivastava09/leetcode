import java.util.*;

class Solution{
    public long makeSubKSumEqual(int[] arr,int k){
        int n=arr.length;
        long ans=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            ArrayList<Integer> list=new ArrayList<>();
            int j=i;
            while(!visited[j]){
                visited[j]=true;
                list.add(arr[j]);
                j=(j+k)%n;
            }
            Collections.sort(list);
            int mid=list.get(list.size()/2);
            for(int x:list){
                ans+=Math.abs(x-mid);
            }
        }
        return ans;
    }
}
