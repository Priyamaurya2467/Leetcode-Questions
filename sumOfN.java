package com.maurya;

import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  value of n :");
        int n = sc.nextInt();
         sum(n);
//        System.out.println(ans);
    }
    static void sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        }

//    //Recursive Method
//    static int sum(int n){
//        if (n==1){
//            return 1;
//        }
//        int sumNM1 = sum(n-1);
//        int sumN = sumNM1 + n;
//        return sumN;
    }


