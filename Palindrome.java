package com.maurya;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        palindrome(n);
    }
    static void palindrome(int n){
        int check = 0;
        int temp = n;
        while (n> 0) {
            int ans = n % 10;
            check = check * 10 + ans;
            n = n / 10;
        }
        if(check == temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
