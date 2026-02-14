class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] s1=s.split("\\s+");
        int i=0;
        int j=s1.length-1;
        String ans="";
        while(i<j){
            String t=s1[i];
            s1[i]=s1[j];
            s1[j]=t;
            i++;
            j--;
        }
        for(int k=0;k<s1.length;k++){
            ans+=s1[k]+" ";
        }
        return ans.trim();
    }
}