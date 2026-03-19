package com.programms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SecondNonrepeatingChar {

    public static void main(String[] args) {
        System.out.println("enter any String");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int count = 0;

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                count++;
                if (count == 3) {
                    System.out.println(m.getKey() + "==" + m.getValue());

                }
            }
        }
    }
}
