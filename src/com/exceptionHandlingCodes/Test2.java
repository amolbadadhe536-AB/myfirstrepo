package com.exceptionHandlingCodes;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("Before array code");
		
		int arr[] = {10,20,30,40};
		//			 0   1  2  3
		
		System.out.println("Displaying array elements : ");
		
		try
		{
			System.out.println("Inside try block");
			for(int i = 0; i < 15; i++)
			{
				System.out.print(arr[i]+"\t");
			}
			System.out.println("\nvirat\n");
			
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e);
			//e.printStackTrace();
			System.out.println("Inside catch block");
		}
		finally
		{
			System.out.println("Inside finnaly block");
		}
		
		System.out.println("After array code");
		

	}

}