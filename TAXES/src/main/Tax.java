package main;

public class Tax {
	public double taxPercent(int a) {
		if (a < 15000) {
			return 0.0;
		} else if (a >= 15000 & a < 20000) {
			return 0.10;
		} else if (a >= 20000 & a < 30000) {
			return 0.15;
		} else if (a >= 30000 & a < 45000) {
			return 0.20;
		} else {
			return 0.25;
		}
	}
	public double taxAmount(int a) {
		return a*taxPercent(a);
	}
}