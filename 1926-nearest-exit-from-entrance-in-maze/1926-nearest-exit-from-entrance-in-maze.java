
class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[] > q=new LinkedList<>();
        q.add(entrance);
      //  int [][] visited=new int
      int l=0;//[entrance.length][entrance.length];
      //  visited[i][j]=true;
      int[][] dir={{-1,0},{0,-1},{0,1},{1,0}};
      maze[entrance[0]][entrance[1]]='+';
        while(!q.isEmpty()){
            int size=q.size();
            l++;
            while(size-->0){
                int[] f=q.poll();
                for(int[] d:dir){
                    int nr=f[0]+d[0];
                    int nc=f[1]+d[1];
                    if(nr<0 || nc<0 || nr>=maze.length || nc>=maze[0].length || maze[nr][nc]=='+'){
                        continue;
                    }
                    if(nr==0 || nc==0 || nr==maze.length-1 || nc==maze[0].length-1) return l;
                    maze[nr][nc]='+';
                    q.add(new int[]{nr,nc});
                }

            }
        }
        return -1;
    }
}