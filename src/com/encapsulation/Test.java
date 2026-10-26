package com.encapsulation;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("Testing Encapsulation");
		
		Student s1 = new Student();
     	s1.setRno(11);
     	s1.setName("Amol Badadhe");
		s1.setMks(82);
		
		Student s2 = new Student();
     	s2.setRno(12);
     	s2.setName("Umesh Kasule");
		s2.setMks(90);
		
		Student s3 = new Student();
     	s3.setRno(13);
     	s3.setName("Gautam Dongare");
		s3.setMks(92);
		
		Student s4 = new Student();
     	s4.setRno(14);
     	s4.setName("Ganesh Bodakhe");
		s4.setMks(95);

		System.out.println("rno : "+s1.getRno());
		System.out.println("name : "+s1.getName());
		System.out.println("mks : "+s1.getMks());
		
		
		System.out.println("rno : "+s2.getRno());
		System.out.println("name : "+s2.getName());
		System.out.println("mks : "+s2.getMks());
		
				
		System.out.println("rno : "+s3.getRno());
		System.out.println("name : "+s3.getName());
		System.out.println("mks : "+s3.getMks());
		
		
		System.out.println("rno : "+s4.getRno());
		System.out.println("name : "+s4.getName());
		System.out.println("mks : "+s4.getMks());

		
		
		
		
		

	}

}
