class Solution {
    public boolean winnerOfGame(String colors) {
        int counta=0;
        int countb=0;
        for(int i=1;i<colors.length()-1;i++){
            char pre=colors.charAt(i-1);
            char next=colors.charAt(i+1);
            if(pre == colors.charAt(i) && colors.charAt(i) == next){

                if(colors.charAt(i)=='A'){
                    counta++;
                }
                else{
                    countb++;
                }
            }
        }
        return counta>countb;
    }
}