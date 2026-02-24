import java.util.ArrayList;

public class Array_leaders {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 4, 1};
        System.out.println(leaders(arr));
    }
    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[arr.length-1]);
        for (int i = arr.length-2; i >0 ; i--){
            if (arr[i] >= arr[i+1]){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
