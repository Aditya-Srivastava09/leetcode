class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        String s=" ";
        while(n>0){
            s=(n%2)+s;
            n=n/2;
        }
        String d="";
        s=s.trim();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                d+="0";
            }
            else{
                d+=1;
            }

        }
        int ans=0;
        int k=1;
        for(int i=d.length()-1;i>=0;i--){
            if(d.charAt(i)=='1'){
                ans+=k;                        
            }
            k=k<<1;
        }
        return ans;
                }
}