class Solution {
    public int minLength(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        //int l=i+1;
        while( i+1<sb.length()){
            if(sb.substring(i,i+2).equals("AB")  ){
                sb.delete(i,i+2);
                i=0;
                continue;
            }
            else if(sb.substring(i,i+2).equals("CD")){
                sb.delete(i,i+2);
                i=0;
                continue;
            }
            i++;
            //++;

        }
        return sb.length();
    }
}