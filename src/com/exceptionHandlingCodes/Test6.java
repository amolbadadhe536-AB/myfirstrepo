package com.exceptionHandlingCodes;

import java.util.Scanner;

public class Test6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers (enter 0 for the second number to test exception):");
        int n = sc.nextInt();
        int m = sc.nextInt();

        A1 obj = new A1();
        
        
        obj.abc(n, m);

       
        obj.display();

        sc.close();
    }

}