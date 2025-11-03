class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> a=new ArrayList<>();
        ans(a,"",0,0,n);
        return a;
    }
    public static void ans(List<String> a,String current,int o,int c,int max){
        if(current.length()==max*2){
            a.add(current);
            return;
        }
        if(o<max){
          ans(a,current+"(",o+1,c,max);
        }
        if(c<o){
            ans(a,current+")",o,c+1,max);
        }
    }
}