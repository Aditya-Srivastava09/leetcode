class Solution {
    public int countArrangement(int n) {
        boolean[] visited=new boolean[n+1];
        int a=helper(1,n,visited);
        return a;
    }
    public int  helper(int pos,int n,boolean[] visited){
        int count=0;
        if(pos>n){
           // count++;
            return 1;
        }
        for(int i=1;i<=n;i++){
            if(!visited[i] && (pos%i==0 || i%pos==0) ){
                visited[i]=true;
                count+=helper(pos+1,n,visited);
                visited[i]=false;
            }
        }
        return count;
    }
}