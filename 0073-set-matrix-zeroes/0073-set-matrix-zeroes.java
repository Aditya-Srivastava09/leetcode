class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> r=new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]==0){
                        r.add(i);
                        col.add(j);
                    }
            }
        }
        for(int i=0;i<r.size();i++){
            int k=r.get(i);
            for(int j=0;j<matrix[0].length;j++){
               matrix[k][j]=0;
            }
        }
        for(int i=0;i<col.size();i++){
            int k=col.get(i);
            for(int j=0;j<matrix.length;j++){
               matrix[j][k]=0;
            }
        }

    }
}