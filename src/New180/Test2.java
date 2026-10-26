package New180;



	public class Test2 {

		public static void main(String[] args) {
			
			// with parameter with return value/type
			
			AdditionDemo obj = new AdditionDemo();
			
			int a = 10, b = 20;
			int res = obj.addition1(a, b);
			System.out.println("Addition1 : "+res);
			
			
			// with parameter without return value/type
			
			int p = 100, q = 200;
			obj.addition2(p, q);
		
		
			// without parameter with return value/type
			int res2 = obj.addition3();
			System.out.println("Addition3 : "+res2);
		
			// without parameter without return value/type
		
			obj.addition4();
		
		
		
		
		
		}

	}