package NumberDemo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter how many number do you want to print form fibonacci series :");
		int n = sc.nextInt();
		
		Fibonacci obj = new Fibonacci();
		obj.printNumber(n);
     
	}

}
