class Solution {
    public int kthGrammar(int n, int k) {
        int a=solve(n,k);
        return a;
    }
    public int solve(int n,int k){
        if(n==1 && k==1){
            return 0;
        }
        int length=(int) Math.pow(2,n-1);
        int mid=(int)(length/2);
        if(k<=mid){
            return solve(n-1,k);
        }
        else{
           return 1-solve(n-1,k-mid);
        }
    }
}