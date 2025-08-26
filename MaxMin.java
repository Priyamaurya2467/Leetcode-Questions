package com.maurya;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print NO.1");
        int n = sc.nextInt();
        System.out.println("Print NO.2");
        int m = sc.nextInt();
        System.out.println("Print NO.3");
        int p = sc.nextInt();
        int max = max(n, m, p);
        int min = min(n, m, p);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    static int max(int n, int m, int p) {
        int max = n;
        if ( m > max && m > p) {
            max = m;
        }
        else if  ( p > max && p > m) {
            max = p;
        }
        return max;
        }

    static int min(int n, int m, int p) {
        int min = n;
        if ( m < min && m < p) {
            min = m;
        }
        else if  ( p < min && p < m) {
            min = p;
        }
        return min;

    }

}
