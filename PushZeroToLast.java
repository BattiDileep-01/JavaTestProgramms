package com.programms;

import java.util.Arrays;

public class PushZeroToLast {

    public static void main(String[] args) {

        int[] num = {1, 0, 2, 3, 0, 0, 0, 8, 0, 5, 0, 59, 0};
        int start = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]!=0) {
                int temp = num[i];
                num[i] = num[start];
                num[start] = temp;
                start++;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
