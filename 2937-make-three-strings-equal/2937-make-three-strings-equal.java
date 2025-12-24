class Solution {
    public int findMinimumOperations(String s1,String s2,String s3) {
        int ans=-1;
        int length=0;
        int minLen=Math.min(s1.length(),Math.min(s2.length(),s3.length()));

        for(int i=0;i<minLen;i++){
            if(s1.charAt(i)==s2.charAt(i)&&s2.charAt(i)==s3.charAt(i)){
                length++;
            }else{
                break;
            }
        }

        if(length==0){
            return ans;
        }else{
            return(s1.length()-length)+(s2.length()-length)+(s3.length()-length);
        }
    }
}
