package com.maurya;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number 1");
        int n=sc.nextInt();
        System.out.println("Enter the number 2");
        int m=sc.nextInt();
        sum( n , m);
    }
    static void sum(int n , int m){
        int ans = n + m ;
        System.out.println(ans);
    }
}
