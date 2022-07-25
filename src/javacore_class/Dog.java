package javacore_class;

public class Dog {

	private int weight;
	private int height;
	private String color;
	private String name;

	public Dog() {
		this("Nhoorn", 20);
		System.out.println("Constructor with no parameter");
	}

	public Dog(String name, int weight) {
		this.setName(name);
		this.setWeight(weight);
	}
	// handle with attribute properties getter and setter. 
	// We can use getter and setter function to check validation of data before update or return
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
