import java.util.Arrays;

public class print_path {
    public static void main(String[] args) {

                boolean [][] board = {
                        {true,true,true},
                        {true,true,true},
                        {true,true,true}
                };
                int[][] path = new int[board.length][board[0].length];
                    allPaths("" ,board,0,0,path,1);

            }
            static void allPaths(String p,boolean [][] maze,int row,int col , int[][] path , int step){

                if(row==maze.length-1 && col == maze[0].length-1){
                    path[row][col]=step;
                    for (int[] arr : path) {
                        System.out.println(Arrays.toString(arr));
                    }
                    System.out.println(p);
                    System.out.println();
                    return;
                }
                if(!maze[row][col]){
                    return ;
                }

                //i am considering this block in my path.
                maze[row][col] = false;
                path[row][col] = step;
                if(row<maze.length-1){
                    allPaths(p + "D",maze,row+1,col,path,step+1);
                }
                if(col<maze[0].length-1){
                    allPaths(p + "R" ,maze,row,col+1,path,step+1);
                }
                if( row > 0) {
                   allPaths(p + "U", maze, row - 1, col, path,step+1);
                }
                if( col > 0) {
                    allPaths(p + "L", maze, row, col - 1,path,step+1);
                }
                //this line is where the function will be over
                //so before the functon gets removed, also remove changes that were made by the function
                maze[row][col] = true;
                path[row][col] = 0;

            }
        }



