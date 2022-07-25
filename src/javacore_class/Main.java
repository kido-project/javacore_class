package javacore_class;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Dog beagle = new Dog();
		beagle.setName("Jimme");
		beagle.setColor("Mix color");
		beagle.setHeight(50);
		beagle.setWeight(20);
		System.out.println(beagle.getName() + " is the dog have " + beagle.getColor());		
	}
}
