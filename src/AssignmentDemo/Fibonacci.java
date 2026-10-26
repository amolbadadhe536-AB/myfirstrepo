package AssignmentDemo;

public class Fibonacci {
	
			
		void printNumber(int n)
		{
			int a = 0;
			int b = 1;
			System.out.print(a+"\t"+b+"\t");
			
			for(int i =1; i<= n; i++)
			{
				int c = a +b;
				System.out.print(c+"\t");
				a =b;
				b =c;
			}
			
		}

	}



