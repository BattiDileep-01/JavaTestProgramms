package com.programms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReveseBigString {

    public static void main(String[] args) {

        String s = "my name is dileep";
        String rs = " ";
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            rs = word + rs;
        }
        System.out.println(rs);


        System.out.println("=============================");
        //Approch - 2


        String revereString = Arrays.stream(s.trim().split("\\s+")).map(i -> new StringBuffer(i).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(revereString);
    }
}
