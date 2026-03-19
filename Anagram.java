package com.programms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("enter any String");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        str1 = str1.replaceAll("\\s+" , "").toLowerCase();

        System.out.println("enter any String");
        String str2 = sc.next();
        str2 = str2.replaceAll("\\s+" , "").toLowerCase();

        if(str1.length() != str2.length()){
            System.out.println("not a anagram");
        }else {
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1 , ch2)){
                System.out.println("is anagram");
            }else{
                System.out.println("not an anagram");
            }
        }
    }
}
