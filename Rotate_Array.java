import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums,k)));
    }
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i+k %n];
        }
        return nums;

    }
}
