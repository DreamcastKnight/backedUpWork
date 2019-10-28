package main;

public class Boat extends Vehicle {
	
	public Boat() {
		//super("boat", 0, brand, size, weight)
		setSize("medium");
		setBrand("Tracker");
		setNoOfWheels(0);
		setType("Boat");
		setWeight(16);
	}
	
	public int bill() {
		return getWeight() * 30;
	}
	
	public void runOver() {
		System.out.println("Sorry, Nemo");
	}
	
}
