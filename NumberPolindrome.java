package com.programms;

import java.util.Scanner;

public class NumberPolindrome {

    public static void main(String[] args) {

        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
            if (original == reverse) {
                System.out.println("given number is polindrome");
            } else {
                System.out.println("not a polindrome");
            }
        }
    }
