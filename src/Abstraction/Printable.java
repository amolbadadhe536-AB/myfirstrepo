package Abstraction;

public interface Printable {
	void print();
	
	default void msg()
	{
		System.out.println("Inside default method");
		display();
		
	}
	
	static int cube(int x)
	{
		int c=x*x*x;
		return c;
	}
	
	private void display()
	{
		
	System.out.println("Inside Display");
	}
	

}