package New180;

import java.util.Scanner;

public class TestDArr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of row :");
		int r = sc.nextInt();
		
		System.out.println("Enter the size of col :");
		int c = sc.nextInt();
		
		int arr[][] = new int[r][c];
		
		System.out.println("Enter array element :");
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++) 
			{
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("Displaying array elements:");
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("calculating arry element sum: ");
		int esum = 0, osum = 0, total = 0;
		
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; i < r; i++)
			{
				if(arr[i][j] % 2== 0)
				{
					esum = esum + arr[i][j];
				}
				else
				{
					osum = osum + arr[i][j];
				}
				}
			}
		total = esum + esum;
		
		System.out.println("Total : "+total);
		System.out.println("Even esum :"+esum);
		System.out.println("Odd osum :"+osum);
		
		sc.close();
		
		System.out.println("\nMaximum element row-wise:");
		for(int i = 0; i < r; i++)
		{
			int max = arr[i][0]; // Assume the first element of the row is max
			
			for(int j = 1; j < c; j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
			}
			
			System.out.println("Maximum element in row " + i + " : " + max);
		}
		
		}
	
	
	
}
		
			
		
		
	
		