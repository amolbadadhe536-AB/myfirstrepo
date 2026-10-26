package Polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.voice();
		
		Cat c = new Cat();
		c.voice();
		
		Animal a = new Animal();
		a.voice();

	}

}
