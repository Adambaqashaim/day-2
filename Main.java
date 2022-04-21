package com.day2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers to get biggest amongst");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is bigger" + a);
        } else if (b > a && b > c) {
            System.out.println("b is biggest" + b);
        } else {
            System.out.println("c is largest" + c);
        }
    }
}
