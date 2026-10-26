package Oops;

public class C {


    
    public void show1() {
        System.out.println("Inside show1");
    }

    public void show2() {
        System.out.println("Inside show2");
    }

    public void add() {
        System.out.println("Inside the add");
    }

    
    public void display() {
        System.out.println("Inside display");
        
        show1();
        show2();
        add();
    }

    
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}