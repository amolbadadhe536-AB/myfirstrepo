package NumberDemo;
import java.util.Scanner;
public class PalindromeDemo {

    public static void main(String[] args) {
	
    	Scanner sc = new Scanner (System.in);
    	System.out.println("Enter the number to check palindrone or no ");
    	
    	Palindrome pobj = new Palindrome();
    	int no = sc.nextInt();
    	pobj.FindPalindroneNumber(no);
    	
       }
}