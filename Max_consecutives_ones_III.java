public class Max_consecutives_ones_III {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 1};
        int k = 3;
        System.out.println(count(arr, k));
    }
    static int count(int[] arr, int k) {
        int left = 0 , right = 0 , count = 0 , maxLen = 0;
        for(right = 0; right < arr.length; right++) {
            if (arr[right] == 0) {
                count++;
            }
            while (count > k) {
                if (arr[left] == 0) {
                    count--;

                }
                left++;
            }
                maxLen = Math.max(maxLen, right - left + 1);




            }

        return maxLen;
    }
}
