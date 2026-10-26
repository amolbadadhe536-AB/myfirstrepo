package New180;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
	

		
		    

		        Scanner sc = new Scanner(System.in);

		        int a[] = new int[5];

		        System.out.println("Enter 5 values:");

		        for (int i = 0; i < 5; i++) {
		            a[i] = sc.nextInt();
		        }

		        for (int i = 0; i < 5; i++) {
		            if (a[i] % 2 == 0) {
		                System.out.println(a[i]);
		            }
		        }
		    }
		

	}


