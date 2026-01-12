class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(ch=='-' || ch=='+' || ch=='*'){
                List<Integer> a=diffWaysToCompute(expression.substring(0,i));
                List<Integer> b=diffWaysToCompute(expression.substring(i+1,expression.length()));
                for(int x:a){
                    for(int y:b){
                        if(ch=='+') result.add(x+y);
                        if(ch=='-') result.add(x-y);
                        if(ch=='*') result.add(x*y);
                    }
                }
            }
        }
        if(result.isEmpty()){
            result.add(Integer.parseInt(expression));
        }
        return result;
    }
}