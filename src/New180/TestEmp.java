package New180;
import java.util.Scanner;

public class TestEmp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many employee info you want to store : ");
		int n = sc.nextInt();
		
		Emp emps[] = new Emp[n];
		
		System.out.println("Enter the Employee Information :");
		for (int i = 0; i < n; i++)
		{
			emps[i] = new Emp(); 
			System.out.println("\nEnter " + (i + 1) + " employee information:");
			
			System.out.println("Enter the ID : ");
			emps[i].id = sc.nextInt();
			
			sc.nextLine(); 
			
			System.out.println("Enter the name : ");
			emps[i].name = sc.nextLine();
			
			System.out.println("Enter the salary : ");
			emps[i].Salary = sc.nextFloat();
			
			sc.nextLine(); 
			
			System.out.println("Enter the email : ");
			emps[i].email = sc.nextLine(); 
		}
		
		sc.close(); 
		
		System.out.println(" Displaying Employee info ");
		for(int i = 0; i < n; i++)
		{
			emps[i].display(); 
		}
	}
}