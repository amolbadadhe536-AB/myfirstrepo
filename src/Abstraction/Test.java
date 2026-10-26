package Abstraction;

public class Test implements Printable{
	
	public void print() {
		System.out.println("Inside the print test");
		
	}
	

	public static void main(String[] args) {
		
		Test obj=new Test();
		obj.print();
		obj.msg();
		
		int result=Printable.cube(3);
		System.out.println("cube"+result);
		

	}

}