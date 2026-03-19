package com.programms;

import java.util.*;
import java.util.stream.Collectors;

public class SortingOrder {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("dileep");
        l.add("deva");
        l.add("rajitha");
        l.add("jyothi");
        l.add("charan");

        Comparator<String> naturalsorting = (n1 , n2) -> n1.compareTo(n2);
        Collections.sort(l, naturalsorting);

        List<String> reversesortedlist = l.stream().sorted((n1, n2) -> -n1.compareTo(n2)).collect(Collectors.toList());

        System.out.println("naturalsorting ==>"+ l);
        System.out.println("reversesortedlist ==> " + reversesortedlist);
    }
}
