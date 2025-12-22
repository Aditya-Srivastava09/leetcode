class Solution {
    public int minDeletionSize(String[] strs) {
        int n=strs.length;
        int m=strs[0].length();
        int count=0;
        boolean[] fixed=new boolean[n-1];

        for(int col=0;col<m;col++){
            boolean delete=false;

            for(int i=0;i<n-1;i++){
                if(fixed[i]) continue;

                if(strs[i].charAt(col)>strs[i+1].charAt(col)){
                    delete=true;
                    break;
                }
            }

            if(delete){
                count++;
                continue;
            }

            for(int i=0;i<n-1;i++){
                if(!fixed[i]&&strs[i].charAt(col)<strs[i+1].charAt(col)){
                    fixed[i]=true;
                }
            }
        }
        return count;
    }
}
