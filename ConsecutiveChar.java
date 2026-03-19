package com.programms;

import java.util.Scanner;

public class ConsecutiveChar {

    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String result = "";
        for (int i = 0; i < s.length(); i++) {

            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                continue;
            } else
                result = result + s.charAt(i);
        }
        System.out.println(result);
    }
}
