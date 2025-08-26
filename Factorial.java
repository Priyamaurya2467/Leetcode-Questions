package com.maurya;



import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

          fact(n);
//        System.out.println(ans);

    }
    static void fact(int n){
        int ans = 1;
        if (n == 0){
            ans = 1;
        }
        else {
            for (int i = 1; i <= n ; i++) {
                ans = ans * i;

            }
        }
            System.out.println(ans);
        }

    }


    //Recursive Method
//     static int fact(int n){
//        if ( n == 1 || n==0){
//            return 1;
//        }
//        return n * fact(n-1);
//    }
//}


