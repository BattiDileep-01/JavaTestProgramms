package com.programms;

import java.util.Scanner;

public class UpperAndLowerCase {

    public static void main(String[] args) {

        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        StringBuffer upper = new StringBuffer();
        StringBuffer lower = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper.append(ch);
            } else
                lower.append(ch);
        }
        System.out.println("upper case char is ==> " + upper);
        System.out.println("lower case char is ==> " + lower);
    }
}
