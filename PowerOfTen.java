package com.programms;

import java.util.Scanner;

public class PowerOfTen {

    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n > 0){

            while(n%10 == 0) {
                n = n / 10;
            }
                if(n ==1){
                    System.out.println("given number is power of ten");
                }else
                    System.out.println("given number is not a power of ten");
            }
        }
    }









