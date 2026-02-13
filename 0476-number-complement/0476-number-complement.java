class Solution {
    public int findComplement(int num) {
        StringBuilder sb=new StringBuilder();
        while(num>0){
            int n=num%2;
            sb.append(n);
            num=num/2;
        }
        //String s=sb.toString();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                sb.replace(i,i+1,"0");
            }
            else{
                sb.replace(i,i+1,"1");;
            }
        }
        sb.reverse();
        String s=sb.toString();
        int n=1;
        int res=0;
        for(int i=s.length()-1;i>=0;i--){
              
            if(s.charAt(i)=='1'){
                res+=1*n;
            }
            else{
                res+=0;
            }
             n=n*2;
        }
        return res;
    }
}