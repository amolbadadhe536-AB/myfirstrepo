package com.contructorDemo;

public class Customer {

    public static void main(String[] args) {

        B c1 = new B(1, "Amol", 101, "amol@gmail.com", "Pune", 9876543210L);
        B c2 = new B(2, "Gautam", 102, "gautam@gmail.com", "Mumbai", 9876543211L);
        B c3 = new B(3, "Rohit", 103, "rohit@gmail.com", "Nashik", 9876543212L);
        B c4 = new B(4, "Umesh", 104, "umesh@gmail.com", "Nagpur", 9876543213L);
        B c5 = new B(5, "Sanket", 105, "sanket@gmail.com", "Pune", 9876543214L);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
    }
}