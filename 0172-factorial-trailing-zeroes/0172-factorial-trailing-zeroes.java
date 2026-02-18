class Solution {
    public int trailingZeroes(int n) {
        int c = 0;
        for(int i=5;i<=n;i++){
                int j = i;
                while(j%5==0){
                    c++;
                    j=j/5;
                }
            
        }
    return c;
    }
}