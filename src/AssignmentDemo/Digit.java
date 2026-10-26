package AssignmentDemo;

public class Digit {
	
	
	    void countAndSum(int n)
	    {
	        int count = 0;
	        int sum = 0;

	        while (n > 0)
	        {
	            int digit = n % 10;

	            count++;
	            sum = sum + digit;

	            n = n / 10;
	        }

	        System.out.println("Total Digits: " + count);
	        System.out.println("Sum of Digits: " + sum);
	    
	}

}
