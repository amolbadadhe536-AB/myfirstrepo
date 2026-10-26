package com.aggregationDemo;

public class Test {
    public static void main(String[] args) {
    	
    	System.out.println("Hi");
    	
    	Address add1 = new Address("Pune","MH", "IND"); 
    	
    	Employee e1 = new Employee(101, "Amol", 44000, add1);
    	e1.display();
    	
    	Address add2 = new Address("NYC", "WAshington", "USA");
    	Employee e2 = new Employee(102, "John", 75000, add2);
    	e2.display();
    	
    	
    	
    	
    	
    	
       
               
    }
}