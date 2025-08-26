package com.maurya;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ProductBySum {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 ");
        int n = sc.nextInt();
        System.out.println("Enter number2 ");
        int m = sc.nextInt();
        int a = 0;
        int p =0;
        while(a<n) {
            p = p + m;
            a++;
        }
        System.out.println(p);
        }
    }

