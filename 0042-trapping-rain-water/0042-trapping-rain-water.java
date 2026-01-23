class Solution {
    public int trap(int[] height) {
        int total=0;
        int[] leftmax=new int[height.length];
        int[] rightmax=new int[height.length];
        leftmax[0]=height[0];
        int l=height[0];
        for(int i=1;i<height.length;i++){
            l=Math.max(l,height[i-1]);
            leftmax[i]=l;
        }
        rightmax[height.length-1]=height[height.length-1];
        int r=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            r=Math.max(r,height[i+1]);
            rightmax[i]=r;
        }
        for(int i=0;i<height.length;i++){
            
           if(height[i]<leftmax[i] && height[i]<rightmax[i]){
            total+=Math.min(leftmax[i],rightmax[i])-height[i];
            }
        }
     return total;
    }
}