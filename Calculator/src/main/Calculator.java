package main;

public class Calculator {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a + b);
	}

	public int subtract(int a, int b) {
		return (a - b);
	}

	public int multiply(int a, int b) {
		return (a * b);
	}

	public double divide(double a, double b) {
		double total = 0;
		if (a > b) {
			total = (a / b);
		} else {
			System.out.println("invalid");
		}
		return (total);
	}
}