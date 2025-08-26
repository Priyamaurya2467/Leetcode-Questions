package com.maurya;

import java.util.Scanner;

public class GradeShow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number out of 100");
        int n=sc.nextInt();
        GradeCheck(n);
    }
    static void GradeCheck(int n){
        if( n < 100 && n > 91) {
            System.out.println("AA");
            return;
        }
        if(n < 90 && n > 81){
            System.out.println("AB");
            return;
        }
        if(n < 80 && n > 71){
            System.out.println("BB");
            return;

        }
        if(n < 70 && n > 61){
            System.out.println("BC");
            return;

        }
        if(n < 60 && n > 51){
            System.out.println("CD");
            return;

        }
        if(n < 50 && n > 41){
            System.out.println("DD");
        }
        else{
            System.out.println("Fail");

        }

    }
}
