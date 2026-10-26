package New180;

import java.util.*;

public class UserArr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size arr :");
		int size = sc.nextInt();
		
	     int arr[] = {10,20,30,40};
	     
	     int brr[] = new int [size];
	     
	     System.out.println("Enter array values : ");
	     for(int i=0; i < size; i++)
	     {
	    	 brr[i] = sc.nextInt();
	     }
	     
	     System.out.println("Displaying array value :");
	     for(int i =0; i < size; i++)
	     {
	    	 System.out.print(brr[i]+"\t");
	     }
	     
	     

	}

}
