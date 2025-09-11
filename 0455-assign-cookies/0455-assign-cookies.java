class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        boolean []x=new boolean[s.length];
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(!x[j] && g[i]<=s[j]){
                    count++;
                    x[j]=true;
                    break;
                }
                
            }

        }
        return count;
    }
}