class Solution {
    public String arrangeWords(String text) {
        String[] words=text.toLowerCase().split(" ");
        int n=words.length;
        int[] len=new int[n];
        boolean[] used=new boolean[n];
        for(int i=0;i<n;i++){
            len[i]=words[i].length();
        }
        StringBuilder sb=new StringBuilder();
        for(int k=0;k<n;k++){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                if(!used[i]&&len[i]<min){
                    min=len[i];
                }
            }
            for(int i=0;i<n;i++){
                if(!used[i]&&len[i]==min){
                    sb.append(words[i]).append(" ");
                    used[i]=true;
                }
            }
        }
        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        return sb.toString().trim();
    }
}
