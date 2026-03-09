class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
          char ans='0';
        for(char c:map.keySet()){
            if(map.get(c)==1){
                ans=c;
                break;
            }
        }
        int  h=-1;
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ans){
                 h=i;
                 break;
            }
        }
        
        return h;
    }
}