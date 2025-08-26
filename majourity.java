//Given an array arr[]. Find the majority element in the array. If no majority element exists, return -1.
//Note: majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.


public class majourity {
    public static void main(String[] args) {
        int[] a = {12,5};
        int ans = findExtra(a);
        System.out.println( ans );

    }
    static int  findExtra( int[] a ) {
        int n = a.length;
        int extra = n / 2;
        int count = 0;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a.length ; j++) {
                if (a[i] == a[j]) {
                    count++;

                }
            }
                if(count > extra){
                    return a[i];
                }
                else{
                    return -1;
                }
            }
        return -1;
        }

    }

