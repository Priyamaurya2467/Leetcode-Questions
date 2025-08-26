package com.maurya;

import java.util.Scanner;

public class PythagorusTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base :  ");
        int n=sc.nextInt();
        System.out.println("Enter the Height :  ");
        int a=sc.nextInt();
        System.out.println("Enter the Hypotenuse :  ");
        int b=sc.nextInt();
        pyhto( n, a, b);
    }
    static void pyhto(int n, int a, int b){
        double hyp = b * b ;
        double bas = n * n;
        double hie = a * a;
        if ( hyp == bas + hie) {
            System.out.println("Pythagorus Triangle");
        }
        else{
            System.out.println(" No Pythagorus Triangle");

        }

    }
}
