import java.util.ArrayList;

public class return_diagonally {
    public static void main(String[] args) {
        System.out.println(sets("" , 3 ,3));
        System.out.println(setsincrease("" , 0 ,0));
    }

    //from 3 -> 0
    static ArrayList<String> sets(String p , int row , int col ) {
        if(row==1 && col==1 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> lists = new ArrayList<>();
        if(row > 1 && col > 1){
            lists.addAll(sets(p + "D", row - 1, col - 1));
        }
        if (row > 1) {
            lists.addAll(sets(p + "V", row - 1, col ));
        }
        if (col > 1) {
            lists.addAll(sets(p + "H",row, col - 1));
        }
        return lists;
    }
    //from 0 -> 3
    static ArrayList<String> setsincrease(String p , int row , int col ) {
        if(row>3 && col>3 ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> lists = new ArrayList<>();
        if (row < 3) {
            lists.addAll(setsincrease(p + "V", row + 1, col ));
        }
        if (col < 3) {
            lists.addAll(sets(p + "H",row, col + 1));
        }
        return lists;
    }
}