package New180;

import java.util.Scanner;

public class Test {
	
	



	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("hello");
		
		A obj = new A();
		obj.display();
		System.out.println("a : "+obj.a);
		
		B obj2 = new B();
		
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		
		obj2.primeNumber(n);
		
		}
		}
		

	


