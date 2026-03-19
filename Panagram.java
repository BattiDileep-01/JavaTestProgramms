package com.programms;

import java.util.HashSet;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {

        Set<Character> set = new HashSet<>();
     String s = "The quick brown fox jumps over the lazy dog";
        s = s.toLowerCase();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch<= 'z'){
                set.add(ch);
            }
        }

        if(set.size() == 26){
            System.out.println("is panagram");
        }else
            System.out.println("not a panagram");
    }
}















//        String str = "The quick brown fox jumps over the lazy dog".toLowerCase();
//
//        HashSet<Character> set = new HashSet<>();
//
//        for (char ch : str.toCharArray()) {
//            if (ch >= 'a' && ch <= 'z') {
//                set.add(ch);
//            }
//        }
//
//        if (set.size() == 26)
//            System.out.println("Pangram");
//        else
//            System.out.println("Not Pangram");
//    }
//}
