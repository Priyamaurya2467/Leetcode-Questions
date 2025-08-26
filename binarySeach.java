public class binarySeach {
    public static void main(String[] args) {
        int num = 40;
        int precision = 3;
        System.out.println(sqrt(num,precision));
    }
    //0(logN)
    static double sqrt(int num,int precision){
        int start = 0;
        int end = num;
        double root = 0.0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid*mid==num){
                return mid;
            }
            else if(mid*mid>num){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        double incre = 0.1;

        for(int i = 0 ; i<precision ; i++){
            while(root*root <= num){
                root = root + incre;
            }
            root = root - incre;
            incre = incre / 10;
        }
        return root;
    }
}
