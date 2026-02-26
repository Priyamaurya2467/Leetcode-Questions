import java.util.ArrayList;

public class maze {
    //Only go right and down
    public static void main(String[] args) {
        System.out.println(solve(3,3));
        solveSet("", 3,3);
        System.out.println( solveSetArray("", 3,3));

    }
    //Return Integer
    static int solve(int row, int col) {

    if(row == 1 || col == 1){
        return 1;
        }
    int left = solve(row-1,col);
    int right = solve(row,col-1);
    return left+right;
    }

   // Print count
    static void solveSet(String p ,int row, int col) {

        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1) {
            solveSet(p + "D", row - 1, col);
        }
        if(col > 1) {
            solveSet(p + "R", row, col - 1);
        }

    }

    // Return ArrayList
    static ArrayList<String> solveSetArray(String p, int row, int col) {

        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row > 1) {
            list.addAll(solveSetArray(p + "D", row - 1, col));
        }
        if(col > 1) {
            list.addAll(solveSetArray(p + "R", row, col - 1));
        }
       return list;

    }
}
