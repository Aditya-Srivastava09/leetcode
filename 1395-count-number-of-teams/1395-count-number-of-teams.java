class Solution{
    public int numTeams(int[] rating){
        int n=rating.length,count=0;
        for(int j=0;j<n;j++){
            int ls=0,lg=0,rs=0,rg=0;
            for(int i=0;i<j;i++){
                if(rating[i]<rating[j])ls++;
                else if(rating[i]>rating[j])lg++;
            }
            for(int k=j+1;k<n;k++){
                if(rating[k]>rating[j])rg++;
                else if(rating[k]<rating[j])rs++;
            }
            count+=ls*rg+lg*rs;
        }
        return count;
    }
}
