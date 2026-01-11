class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> a=new ArrayList<>();
        int i=0;
        sub(s,a,i,"");
        return a;
    }
    public void sub(String s,List<String> a,int index,String sur){
        if(index==s.length()){
            a.add(sur);
            return;
        }
        if(Character.isLetter(s.charAt(index))){
            char c=Character.toLowerCase(s.charAt(index));
            sub(s,a,index+1,sur+c);
              c=Character.toUpperCase(s.charAt(index));
            sub(s,a,index+1,sur+c);
        }
        else{
            sub(s,a,index+1,sur+s.charAt(index));
        }
    }
}