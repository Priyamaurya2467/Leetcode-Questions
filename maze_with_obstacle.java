import java.util.ArrayList;

public class maze_with_obstacle {
    public static void main(String[] args) {
//        obstacle("",0,0);
        boolean [][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathrestriction("" ,board,0,0);


    }
//    static void obstacle(String p, int row, int col) {
//        if(row==col && row > 0 && col > 0){
//            System.out.println(p);
//            return;
//        }
//        if(row<2){
//            obstacle(p + "D",row+1,col);
//        }
//        if(col<2){
//            obstacle(p + "H",row,col+1);
//        }
//    }


    static void pathrestriction(String p,boolean[][] maze, int row, int col) {
        if(row==maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if(row<maze.length-1){
            pathrestriction(p + "D",maze,row+1,col);
        }
        if(col<maze[0].length-1){
            pathrestriction(p + "H" ,maze,row,col+1);
        }

    }
}
