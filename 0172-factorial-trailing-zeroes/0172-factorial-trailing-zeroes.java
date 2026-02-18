class Solution {
    public int trailingZeroes(int n) {
        int c = 0;
        for(int i=5;i<=n;i++){
            c+=i/5; 
        }
    return c;
    }
}