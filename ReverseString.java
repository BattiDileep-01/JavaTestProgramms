package com.programms;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("enter any String");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String rs = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            rs = ch + rs;
        }
        System.out.println("Reverse String is ==>" + rs);
    }
}
