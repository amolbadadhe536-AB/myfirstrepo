package com.poly;

public class Demo {
	
	public static void main() {
		
		System.out.println("hii main");
	}

	public static void main(String[] args) {
		
		System.out.println("hello main");
		main();
		main("ajay", "vijay");
		
	}
	
	public static void main(String  args, String name) {
		
		System.out.println("heyyyyyyyyyyyyyyyy main\n" +args+" \n"+name);
	}

}
