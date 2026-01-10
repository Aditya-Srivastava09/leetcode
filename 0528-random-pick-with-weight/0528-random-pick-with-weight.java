class Solution {
    int[] prefix;
    Random rand;
    int sum;
    public Solution(int[] w) {
         prefix=new int[w.length];
        sum=0;
        for(int i=0;i<w.length;i++){
            
            prefix[i]=sum+w[i];
            sum+=w[i];
        }
        //pickIndex(sum);
    }
    
    public int pickIndex() {
        rand = new Random();

        int t=rand.nextInt(sum)+1;
        int l=0;
        int h=prefix.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(prefix[mid]<t){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */