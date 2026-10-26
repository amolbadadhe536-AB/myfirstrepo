package com.exceptionHandlingCodes;

public class Test3 {

	public static void main(String[] args) {
		
		String str = null;
		System.out.println(str);
		
		try
		{
			System.out.println("length : "+str.length());
		}
		catch (NullPointerException e)
		{
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("Inside finally");
		}
		System.out.println("Virat Dhoni");
		
		
	}

}
