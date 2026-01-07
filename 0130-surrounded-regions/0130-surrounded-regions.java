class Solution {
    public void solve(char[][] board){
        int m=board.length;
        int n=board[0].length;
        boolean[][] vis=new boolean[m][n];

        for(int j=0;j<n;j++){
            if(board[0][j]=='O') dfs(0,j,vis,board);
            if(board[m-1][j]=='O') dfs(m-1,j,vis,board);
        }

        for(int i=0;i<m;i++){
            if(board[i][0]=='O') dfs(i,0,vis,board);
            if(board[i][n-1]=='O') dfs(i,n-1,vis,board);
        }

        // flip surrounded regions
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && !vis[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }

    public void dfs(int i,int j,boolean[][] vis,char[][] b){
        int m=b.length;
        int n=b[0].length;

        if(i<0 || j<0 || i>=m || j>=n || b[i][j]!='O' || vis[i][j]) return;

        vis[i][j]=true;

        dfs(i-1,j,vis,b);
        dfs(i+1,j,vis,b);
        dfs(i,j-1,vis,b);
        dfs(i,j+1,vis,b);
    }
}
