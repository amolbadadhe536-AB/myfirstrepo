package com.encapsulation;

public class Emp {

	public static void main(String[] args) {
		

		System.out.println("Testing Encapsulation");
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
     	e1.setId(11);
     	e1.setName("Amol");
		e1.setSal(82);
		
		
     	e2.setId(12);
     	e2.setName("Umesh");
		e2.setSal(90);


		System.out.println("id : "+e2.getId());
		System.out.println("name : "+e2.getName());
		System.out.println("sal : "+e2.getSal());
		
		

		System.out.println("id : "+e1.getId());
		System.out.println("name : "+e1.getName());
		System.out.println("sal : "+e1.getSal());
		
		
		
		

	}




	}


