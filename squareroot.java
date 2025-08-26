public class squareroot {
    public static void main(String[] args) {
        int n = 49;
        System.out.println(square(n));
    }
    static int square(int n){
        int c = 2;
        while(c*c<=n){
            if(c*c==n){
                return c;
            }
            c++;
        }
        return -1;

    }
}
