class Solution{
    public int countBeautifulPairs(int[] nums){
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            while(a>=10){
                a/=10;
            }
            for(int j=i+1;j<nums.length;j++){
                int b=nums[j]%10;
                boolean ok=true;
                for(int k=2;k<=9;k++){
                    if(a%k==0&&b%k==0){
                        ok=false;
                        break;
                    }
                }
                if(ok){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
