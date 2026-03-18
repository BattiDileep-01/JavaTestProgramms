package com.programms;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        System.out.println("==============================================");
        //approach -2

        List<StringBuffer> polindrome1 = Arrays.stream(s.split("\\s+"))
                .map(i -> new StringBuffer(i).reverse()).collect(Collectors.toList());

        System.out.println("approacch -2 output ==> " + polindrome1);

        if (s.equals(rs)) {
            System.out.println("given String is polindrome");
        } else {
            System.out.println("given String is not polindrome");
        }
    }
}
