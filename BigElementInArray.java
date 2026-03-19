package com.programms;

import java.util.Arrays;
import java.util.OptionalInt;

public class BigElementInArray {

    public static void main(String[] args) {
        int[] arr = {12, 974, 787, 7987986, 765};
        int bigelement = Arrays.stream(arr).max().getAsInt();

        System.out.println("bigelement ==> " + bigelement);

        int minelement = Arrays.stream(arr).min().getAsInt();

        System.out.println("minelement ==> " + minelement);
    }
}
