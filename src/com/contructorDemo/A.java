package com.contructorDemo;

public class A {
	
	int a;
	String name;
	
	public A()
	{
		System.out.println("Inside default contructor");
		
	}
	
	public A(int x, String y)
	{
		System.out.println("Inside parameter construct");
		a = x;
		name = y;
	}
	
	void display()
	{
		System.out.println("a :"+a);
		System.out.println("name :"+name);
	}
	
	
	

}
