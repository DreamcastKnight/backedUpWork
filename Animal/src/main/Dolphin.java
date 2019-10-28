package main;

public class Dolphin extends Mammal {
	
	
	public Dolphin() {
		
	}
	
	public Dolphin(int noOfLimbs, int weight) {
		this.setNoOfLimbs(noOfLimbs);
		this.setWeight(weight);
	}
	
	public void echoLocate() {
		System.out.println("My super sonic radar will help me");
	}
	@Override
	public void communicate() {
		System.out.println("SO LONG");
		// TODO Auto-generated method stub
		
	}

}
