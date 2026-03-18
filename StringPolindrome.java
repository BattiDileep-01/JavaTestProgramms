package com.programms;

import java.util.Scanner;

public class StringPolindrome {
    public static void main(String[] args) {

        System.out.println("enter any String");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String rs = "";
        sc.close();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            rs = ch + rs;
        }

        System.out.println(s);
        System.out.println(rs);
        if (s.equals(rs)) {
            System.out.println("given String is polindrome");
        } else {
            System.out.println("given String is not polindrome");
        }
    }
}
