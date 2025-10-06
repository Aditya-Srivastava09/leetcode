class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> a=new ArrayList<>();
        ArrayList<String> result=new ArrayList<>();
        helper(s,a,result,0);
        return a;
    }
    public void helper(String s,List<List<String>> a,ArrayList<String> result,int idx){
        if(idx==s.length()){
            a.add(new ArrayList<>(result));
        }
        for(int i=idx;i<s.length();i++){
        if(palindrome(s,idx,i)){
            result.add(s.substring(idx,i+1));
            helper(s,a,result,i+1);
            result.remove(result.size()-1);
        }
        }

    }
    public boolean palindrome(String s,int idx,int n){
        while(idx<=n){
            if(s.charAt(idx)!=s.charAt(n)) return false;
            idx++;
            n--;
        }
        return true;
    }
}