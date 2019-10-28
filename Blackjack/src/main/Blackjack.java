package main;

public class Blackjack {
	public int method(int b, int c) {
		if (b > 21 && c > 21) {
			System.out.println("play " + b + " " + c);
			return 0;
		} else if (b > 21 && c <= 21) {
			System.out.println("play " + b + " " + c);
			b = 0;
			return (b) + (c);
		} else if (b <= 21 && c > 21) {
			System.out.println("play " + b + " " + c);
			c = 0;
			return (b) + (c);
		} else if (b <= 21 && c <= 21 && b > c) {
			System.out.println("play " + b + " " + c);
			return b;
		} else {
			System.out.println("play " + b + " " + c);
			return c;
		}
	}
}
