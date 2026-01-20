class Solution{
    public int maximumLength(String s){
        int n=s.length();
        ArrayList<Integer>[] runs=new ArrayList[26];
        for(int i=0;i<26;i++)runs[i]=new ArrayList<>();

        for(int i=0;i<n;){
            int j=i;
            char c=s.charAt(i);
            while(j<n&&s.charAt(j)==c)j++;
            runs[c-'a'].add(j-i);
            i=j;
        }

        int ans=-1;

        for(int c=0;c<26;c++){
            if(runs[c].isEmpty())continue;
            runs[c].sort((a,b)->b-a);

            int L1=runs[c].get(0);
            int L2=runs[c].size()>1?runs[c].get(1):0;
            int L3=runs[c].size()>2?runs[c].get(2):0;

            ans=Math.max(ans,L1-2);
            ans=Math.max(ans,Math.min(L1-1,L2));
            ans=Math.max(ans,L3);
        }

        return ans<=0?-1:ans;
    }
}
