class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        int a=-1;
        int c=needle.length();
        for(int i=0;i<=haystack.length()-c;i++){
            if(haystack.substring(i,i+c).equals(needle)){
                a=i;
                break;
            }
            
        }
        return a;
    }
}