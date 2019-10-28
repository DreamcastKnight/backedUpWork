package main;

public class Car extends Vehicle {
	public Car() {
		setSize("small");
		setBrand("audi");
		setNoOfWheels(4);
		setType("Car");
		setWeight(2);
	}

	public int bill() {
		return getWeight() * 30;
	}

}
