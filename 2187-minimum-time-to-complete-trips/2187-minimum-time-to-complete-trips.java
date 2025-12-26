class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left=1;
        long mintime=Long.MAX_VALUE;
        for(int t:time){
            mintime=Math.min(mintime,t);
        }
        long high=mintime*(long)totalTrips;
        while(left<high){
            long mid=left+(high-left)/2;
            long trips=0;
            for(int t:time){
                trips+=mid/t;
                if(trips>=totalTrips){
                    break;
                }
            }
            if(trips>=totalTrips){
                high=mid;
            }
            else{
                left=mid+1;
            }

        }
        return left;
    }
}