package com.exceptionHandlingCodes;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
			System.out.print("Enter roll Number: ");
			int rno = sc.nextInt();
			
			sc.nextLine(); 
			
			System.out.print("Enter  Name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter marks: ");
			float  mks = sc.nextFloat();
			
			System.out.println("rNo : "+rno+"\tname :"+name+"\tmks : "+mks);
		
	}
	
	}
	
