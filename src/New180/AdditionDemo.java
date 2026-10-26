package New180;

public class AdditionDemo {

	

	
		
		// with parameter with return value/type
		
		int addition1(int x, int y)
		{
			int sum = x + y;
			
			return sum;
		}

		// with parameter without return value/type
		
		void addition2(int m, int n)
		{
			int sum = m + n;
			System.out.println("Addition2 : "+sum);
		}
		
		// without parameter with return value/type
		
		int addition3()
		{
			int a = 15, b = 30;
			int sum = a + b;
			
			return sum;
		}
		
		// without parameter without return value/type
		
		void addition4()
		{
			int a = 90, b = 5;
			int sum = a + b;
			System.out.println("Addition4 : "+sum);
		}
	}

