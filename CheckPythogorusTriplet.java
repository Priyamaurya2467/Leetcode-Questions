package com.maurya;

import java.util.Scanner;

public class CheckPythogorusTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter NO.1");
        int a = sc.nextInt();
        System.out.println("Enter NO.2");
        int b = sc.nextInt();
        System.out.println("Enter NO.3 (largest )");
        int c = sc.nextInt();
        pyhog( a , b , c );
    }
    static void pyhog(int a, int b, int c){
        double larg  = c * c;
        double one = a * a ;
        double two = b * b;
        if ( larg == one + two){
            System.out.println("Pythogorus Triplet");
        }
        else{
            System.out.println("Not a  Pythogorus Triplet");
        }




        }
    }

