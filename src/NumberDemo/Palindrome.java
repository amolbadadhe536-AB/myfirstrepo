package NumberDemo;

public class Palindrome {
	
	void FindPalindroneNumber(int n) {
		int copy = n;
		int temp = 0;
		while(n>0) {
			int remainder = n % 10;
			temp =(temp * 10)+ remainder;
			n = n /10;
			
		}
		if(temp == copy) {
			System.out.println(copy +"is palindrome number :");
			
		}
		else {
			System.out.println(temp +"is not palindrome number :");
		}
	}

}