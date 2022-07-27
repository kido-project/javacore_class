package javacore_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Dog beagle = new Dog();
		beagle.setName("Jimme");
		beagle.setColor("Mixed color");
		beagle.setHeight(50);
		beagle.setWeight(20);
		System.out.println(beagle.getName() + " is the dog have " + beagle.getColor());
		
		// Ke thua trong java
		Animal animal = new Animal("Jimme", 2, 20);
		Cat cat = new Cat("Nhon", 1, 5, true);
		
		cat.eat();
		cat.move();

	}
}
