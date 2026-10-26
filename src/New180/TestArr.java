package New180;

import java.util.Scanner;

public class TestArr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the array element :");
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Displying the array elements");
		for(int i = 0; i< n ; i++)
		{
			System.out.print(arr[i]+"\t");
		}
		

	}

}
