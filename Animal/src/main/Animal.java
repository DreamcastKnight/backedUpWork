package main;

public abstract class Animal {

	private int noOfLimbs;
	private int weight;
	
	
	
	@Override
	public String toString() {
		return "Animal [noOfLimbs=" + noOfLimbs + ", weight=" + weight + "]";
	}
	public Animal(int noOfLimbs, int weight) {
		super();
		this.noOfLimbs = noOfLimbs;
		this.weight = weight;
	}
	public Animal() {
		super();
	}
	public void die() {
		System.out.println("Press 'F' to pay respects.");
	}
	
	
	public abstract void communicate();

	public int getNoOfLimbs() {
		return noOfLimbs;
	}

	public void setNoOfLimbs(int noOfLimbs) {
		this.noOfLimbs = noOfLimbs;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
