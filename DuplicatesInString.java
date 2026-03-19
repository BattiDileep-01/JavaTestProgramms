package com.programms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicatesInString {

    public static void main(String[] args) {
        System.out.println("enter any String");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else
                map.put(ch, 1);
        }
        System.out.println(map);
    }
}
