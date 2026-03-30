class Solution {
    public boolean checkStrings(String s1, String s2) {
    int [] evenparity1=new int[26];
    int [] evenparity2=new int[26];
    int [] oddparity1=new int[26];
    int [] oddparity2=new int[26];
    for(int i=0;i<s1.length();i=i+2){
        evenparity1[s1.charAt(i)-'a']++;
    }
     for(int i=0;i<s2.length();i=i+2){
        evenparity2[s2.charAt(i)-'a']++;
    }
    for(int i=1;i<s1.length();i=i+2){
        oddparity1[s1.charAt(i)-'a']++;
    }
     for(int i=1;i<s2.length();i=i+2){
        oddparity2[s2.charAt(i)-'a']++;
    }
     for(int i=0;i<26;i=i+1){
       if(evenparity1[i]!=evenparity2[i] || oddparity1[i]!=oddparity2[i]){
        return false;
       }
    }
    return true;
    }
}