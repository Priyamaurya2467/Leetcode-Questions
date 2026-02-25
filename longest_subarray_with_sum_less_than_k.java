public class longest_subarray_with_sum_less_than_k {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 10};
        int sum = 14;
        System.out.println(longestSubarray(arr, sum));
    }
    static int longestSubarray(int[] arr, int target) {
        int l =0 , r = 0 , sum = 0 , maxLength = 0;
        while (r < arr.length) {
            sum = sum + arr[r];
            while(sum > target){
                if(sum > target){
                    sum = sum - arr[l];
                    l++;
                }

                if(sum <= target){
                    maxLength = Math.max(maxLength, r - l + 1);
                }



            }
            r++;
        }
        return maxLength;
    }
}