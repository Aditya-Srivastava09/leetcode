class Solution {
    public String largestOddNumber(String num) {
      //  int a=Integer.valueOf(num);
        char[] arr=num.toCharArray();
    
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if((arr[i]-'0')%2!=0){
                  return num.substring(0,i+1);
            }
        }
        return "";
    }
}