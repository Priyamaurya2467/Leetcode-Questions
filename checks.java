// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
// Note: The second largest element should not be equal to the largest
public class checks {

    public static void main(String[] args) {
        int[] a = {2 , 4 , 6 , 8 , 9 , 10 , 12 };
        int[] b = { 2 , 4 , 6 , 8 , 10 , 12};
        int ans = findExtra( a , b );
        System.out.println( ans );
    }
    static int findExtra(int[] a, int[] b) {
        int m = b.length;
        var i = 0;
        for ( i = 0; i < m; i++) {
            if (a[i] != b[i]) {
                return a[i];
            }
        }
        return a[i];
    }
}
