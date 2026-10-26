package com.exceptionHandlingCodes;

public class A1 {

   
    public void abc(int a, int b) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        
        try {
            try {
                int c = a / b;
                System.out.println("Division : " + c);
            } 
            catch (ArithmeticException e1) {
                System.out.println("Inner Catch 1: " + e1);
                
                try {
                    int arr[] = {10, 20, 30};
                    System.out.println("Value : " + arr[4]);
                } 
                catch (ArrayIndexOutOfBoundsException e2) {
                    System.out.println("Inner Catch 2: " + e2);
                }
            } 
            finally {
                System.out.println("inside finally");
            }

            System.out.println("after catch");

        } catch (Exception e) {
            System.out.println("Outer Catch: " + e);
        }
    } 

    public void display() {
        System.out.println("inside display");
    }

}