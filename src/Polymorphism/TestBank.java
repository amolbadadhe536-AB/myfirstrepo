package Polymorphism;

public class TestBank {

	public static void main(String[] args) {
		 
		
		BankI b;
		b = new SBI();
		int s1 = b.getRateofIntrest();
		System.out.println("SBI : "+s1);
		
		b = new ICICI();
		int i1 = b.getRateofIntrest();
		System.out.println("ICICI : "+i1);
		
		b = new HDFC();
		int h1 = b.getRateofIntrest();
		System.out.println("HDFC : "+i1);
		
	}
	


		
		
		
		
		

	}


