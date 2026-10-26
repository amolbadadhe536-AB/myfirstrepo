package com.aggregationDemo;

class Employee12 {
    int id;
    String name;

    Employee12(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Department {
    String deptName;
    Employee12 emp; 

    Department(String deptName, Employee12 emp) { 
        this.deptName = deptName;
        this.emp = emp;
    }

    void display() {
        System.out.println("Department: " + deptName);
        System.out.println("Employee ID: " + emp.id);
        System.out.println("Employee Name: " + emp.name);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Employee12 e1 = new Employee12(102, "Amol");
        Department d1 = new Department("IT Eng", e1);

        d1.display();
    }
}