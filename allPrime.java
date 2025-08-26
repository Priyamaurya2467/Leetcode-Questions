package com.maurya;

import java.util.Scanner;

public class allPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Initial point");
        int n=sc.nextInt();
        System.out.println("Final point");
        int m=sc.nextInt();
        find( n , m);

    }
    static void find(int n,int m){

        for (int i = n ; i <= m ; i++){
            int count = 0;
            for(int j = 2 ; j <= i ; j++) {
                if (i % j == 0) {
                    count++;


                }
            }
                if (count==1){
                    System.out.print( i+" ");

                }


                }
            }
        }


