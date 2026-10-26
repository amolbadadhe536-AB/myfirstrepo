package com.contructorDemo;

public class B {
    
    int a;
    String name;
    int id;
    String email;
    String address;
    long mobileNo;

    public B() {
        System.out.println("Inside default constructor");
    }

    public B(int x, String y, int id, String email, String address, long mobileNo) {
        System.out.println("Inside parameter constructor");

        a = x;
        name = y;
        this.id = id;         
        this.email = email;    
        this.address = address;
        this.mobileNo = mobileNo;
    }

    void display() {
        System.out.println("a : " + a);
        System.out.println("name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Email : " + email);
        System.out.println("Address : " + address);
        System.out.println("Mobile No : " + mobileNo);
   
    }
} 