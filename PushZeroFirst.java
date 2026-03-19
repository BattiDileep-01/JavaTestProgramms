package com.programms;

import java.util.Arrays;

public class PushZeroFirst {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 0, 0, 8, 0, 5, 0, 59, 0};
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
                start++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
