package operaturs;

import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args) {
	
   // int mks=52;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your marks : ");
		int mks = sc.nextInt();
    
    if (mks >=90 && mks <=100)
    {
    System.out.println("Grade A");
    }
    else if (mks >=70 && mks <=90) {
    System.out.println("Grade B");	
    }
    else if (mks >=50 && mks <=70) {
    System.out.println("Grade C");
    }
    else if (mks >=35 && mks <=50) {
    System.out.println("Grade D");
    }
    else if (mks >=0 && mks <=35) {
    System.out.println("Failed");
    }
    else
    {
    	System.out.println("Invalid Number");
    }
    }
    	
	

}
