class Solution {
    public int countArrangement(int n) {
        boolean[] a=new boolean[n+1];
        int count=helper(1,n,a);
        return count;
    }
    public int helper(int pos,int n,boolean[] a){
        if(pos>n){
             return 1;
        }
        int c=0;
        for(int i=1;i<=n;i++){
            if(a[i]!=true &&(pos%i==0 || i%pos==0)){
                a[i]=true;
                c+=helper(pos+1,n,a);
                a[i]=false;
            }
        }
        return c;
    }
}