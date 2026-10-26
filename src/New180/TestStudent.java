package New180;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many student info you want to store : ");
		int n = sc.nextInt();
		
		Student st[] = new Student[n];
		
		System.out.println("Enter the student Information :");
		for (int i = 0; i < n; i++)
		{
			st[i] = new Student();
			System.out.println("Enter " + (i + 1) + " student information:");
			
			System.out.println("Enter the roll number : ");
			st[i].rno = sc.nextInt();
			
			sc.nextLine(); 
			
			System.out.println("Enter the name : ");
			st[i].name = sc.nextLine();
			
			System.out.println("Enter the marks : ");
			st[i].mks = sc.nextFloat();
		}
		
		sc.close(); 
		
		System.out.println(" Displaying student info");
		for(int i = 0; i < n; i++)
		{
			st[i].display(); 
		}
	}
}