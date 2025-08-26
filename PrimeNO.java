package com.maurya;

import java.util.Scanner;

public class PrimeNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        primeNoCheck(n);
    }
    static void primeNoCheck(int n){
        for(int i=2;i*i<n;i++){
            if(n%i==0) {
                System.out.println("Not prime");
                return;
            }
            else{
                System.out.println("Prime");
            }
        }
    }
}
