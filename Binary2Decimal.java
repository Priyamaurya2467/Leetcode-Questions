public class Binary2Decimal {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(covert2Binary(n));
    }
    public static String covert2Binary(int n){
        String result = "";
        while(n!=1){
            if((n&1)==1){
                result += "1";
            }
            else{
                result += "0";
            }
            n = n/2;
        }
        result += "1";

       StringBuilder sb = new StringBuilder(result);
       return sb.reverse().toString();
    }
}
