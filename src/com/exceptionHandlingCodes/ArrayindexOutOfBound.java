package com.exceptionHandlingCodes;

import java.util.Scanner;

public class ArrayindexOutOfBound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter one more number:");
        int extraNumber = sc.nextInt();

        try {
            arr[5] = extraNumber; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You cannot insert a 6th number into an array of size 5.");
        }

        sc.close();
    }
}