package AssignmentDemo;

public class Palindrome {
	
	
	    void checkPalindrome(int n)
	    {
	        int temp = n;
	        int rev = 0;

	        while (n > 0)
	        {
	            int digit = n % 10;
	            rev = rev * 10 + digit;
	            n = n / 10;
	        }

	        if (temp == rev)
	        {
	            System.out.println("Palindrome Number");
	        }
	        else
	        {
	            System.out.println("Not Palindrome Number");
	        }
	    
	}

}
