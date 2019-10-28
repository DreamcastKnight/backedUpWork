package main;

public class Conditional {

	public int method(int a, int b, boolean c) {
		if (a % 2 == 0 | b % 2 == 0) {
			return 0;
		} else if (c) {
			return a + b;
		} else {
			return a * b;
		}

	}

}