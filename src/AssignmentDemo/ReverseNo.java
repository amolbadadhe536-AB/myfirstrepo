package AssignmentDemo;

public class ReverseNo {
	
    void reverseNumber(int n)
    {
        int rev = 0;

        while (n > 0)
        {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse Number: " + rev);
    }

}