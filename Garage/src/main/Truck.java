package main;

public class Truck extends Vehicle {
	
	public Truck() {
		setSize("large");
		setBrand("volvo");
		setNoOfWheels(18);
		setType("Truck");
		setWeight(6);
	}
	
	
	public int bill() {
		return getWeight() * 30;
	}
	
	public void runOver(){
		System.out.println("SPLAT");
	}
	
}
