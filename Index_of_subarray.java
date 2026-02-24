import java.util.ArrayList;
import java.util.Arrays;

public class Index_of_subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 15;
        System.out.println(subarraySum(arr,target));
    }
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int left = 0;

        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for(int right = 0; right < arr.length ; right++){
            sum = sum + arr[right];
            while (sum > target && left <= right){
                sum = sum-arr[left];
                left++;
            }
            if (sum == target){
                result.add(left+1);
                result.add(right+1);
                break;

            }
        }
        if (result.size()==0){
            result.add(-1);
        }
        return result;
    }
}
