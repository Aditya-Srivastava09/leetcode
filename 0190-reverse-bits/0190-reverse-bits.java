public class Solution {
    public int reverseBits(int n) {
      //String s=Integer.toBinaryString(n);
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<32;i++){
         int s=n &(1);
         sb.append(s);
         n=n>>>1;
      }
      String a=sb.toString();
      int k=Integer.parseInt(a,2);
      return k;
     
    }
}
