package com.poly;

public class Addition {
    
    
    public void add(int a, int b) {
        int result = a + b;
        System.out.println(a + " + " + b + " = " + result); 
    }
    
    
    public void add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + result);
    }

    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(5, 10);        
        obj.add(2, 4, 6);     
    }
}