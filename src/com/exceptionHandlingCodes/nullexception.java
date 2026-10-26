package com.exceptionHandlingCodes;

import java.util.Scanner;

public class nullexception {

	public static void main(String[] args) {
		
				

	
			
	
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter your name :");
				String name = sc.nextLine();
				
				try
				{
					name = null;
					System.out.println(name.length());
				}
				catch(NullPointerException e)
				{
					System.out.println("Null value exception");
					
					sc.close();
				}
			}

		}