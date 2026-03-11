class Solution {
    public int maxArea(int[] height) {
        int r=height.length-1;
        int l=0;
        int ans=0;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int width=(r-l);
            ans=Math.max(ans,(h)*width);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }

        }
        return ans;

    }
}