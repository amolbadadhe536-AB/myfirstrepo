package com.contructorDemo;

public class Test {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.a = 10;
		obj.name ="ram";
		obj.display();
		
		A obj2 = new A();
		obj2.display();
		
		A obj3 = new A(21,"sita");
		obj3.display();
		
		obj2.display();
		
		
		
		

	}

}
