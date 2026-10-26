package com.exceptionHandlingCodes;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = 100; 
		
		System.out.println("Enter second Number :");
		int b = sc.nextInt();
		
		try {
			int div = a / b;
			System.out.println("Division : " + div);
		}
		catch (ArithmeticException e)
		{
			int add = a + b; 
			System.out.println("Cannot divide by zero! Doing Addition instead: " + add);
		}
		
		sc.close();
	}

}