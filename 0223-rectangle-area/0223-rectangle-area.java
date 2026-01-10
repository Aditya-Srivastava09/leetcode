class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
         int area=0;
         int l1=Math.abs(ax1)+Math.abs(ax2);
         int r1=Math.abs(ay1)+Math.abs(ay2);
         int a1=l1*r1;
         int l2=Math.abs(bx1)+Math.abs(bx2);
         int r2=Math.abs(by1)+Math.abs(by2);
         int a2=l2*r2;
         int sum=a1+a2;
         int d=Math.max(ax1,bx1);
         int d1=Math.min(ax2,bx2);
          int h=Math.min(ay2,by2);
           int h1=Math.max(ay1,by1);
         if(d1>d){
           int w=Math.abs(d)+Math.abs(d1);
           int hh=Math.abs(h)+Math.abs(h1);
           int o=w*hh;
           sum=sum-o;
         }





       return sum;
    }

}