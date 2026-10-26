package com.exceptionHandlingCodes;

import java.util.Scanner;

public class StringIndexOutOfBound {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		
		int n = name.length();
		
		System.out.println("n : "+n);
		try
		{
			System.out.println(name.charAt(5));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("jayuuuu");
		
		
		/*
		for(int i= 0; i <= n; i++)
		{
			System.out.println(name.charAt(i));
		}*/
	}

}
