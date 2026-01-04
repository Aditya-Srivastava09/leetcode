class Solution {
    public int countSubstrings(String s) {
        int c=0;

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String a=s.substring(i,j+1);
                if(p(a)){
                    c++;
                }
            }
        }
        return c;
    }
    public boolean p(String s){
        int i=0;
        int l=s.length()-1;
        while(i<=l){
            if(s.charAt(i)!=s.charAt(l)){
                return false;
            }
            i++;
            l--;
        }
        return true;
    }
}