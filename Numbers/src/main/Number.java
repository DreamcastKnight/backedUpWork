package main;

public class Number {
	public int addNum(int a) {
		int number1 = a / 10;
		int number2 = a % 10;
		return number1 + number2;
	}

	public String numToString(int a) {
		String sing = " ";
		String ten = " ";
		String hund= " ";
		if (a < 21) {
			if (a == 1) {
				return "one";
			} else if (a == 2) {
				return "two";
			} else if (a == 3) {
				return "three";
			} else if (a == 4) {
				return "four";
			} else if (a == 5) {
				return "five";
			} else if (a == 6) {
				return "six";
			} else if (a == 7) {
				return "seven";
			} else if (a == 8) {
				return "eight";
			} else if (a == 9) {
				return "nine";
			} else if (a == 10) {
				return "ten";
			} else if (a == 11) {
				return "eleven";
			} else if (a == 12) {
				return "twelve";
			} else if (a == 13) {
				return "thirteen";
			} else if (a == 14) {
				return "fourteen";
			} else if (a == 15) {
				return "fifteen";
			} else if (a == 16) {
				return "sixteen";
			} else if (a == 17) {
				return "seventeen";
			} else if (a == 18) {
				return "eighteen";
			} else if (a == 19) {
				return "nineteen";
			} else if (a == 20) {
				return "twenty";
			}
		} else if (a > 20 & a < 100) {
			if (a / 10 == 2) {
				sing = "twenty";
			} else if (a / 10 == 3) {
				sing = "thirty";
			} else if (a / 10 == 4) {
				sing = "fourty";
			} else if (a / 10 == 5) {
				sing = "fifty";
			} else if (a / 10 == 6) {
				sing = "sixty";
			} else if (a / 10 == 7) {
				sing = "seventy";
			} else if (a / 10 == 8) {
				sing = "eighty";
			} else if (a / 10 == 9) {
				sing = "ninety";
			}
			if (a % 10 == 2) {
				ten = "two";
			} else if (a / 10 == 3) {
				ten = "three";
			} else if (a / 10 == 4) {
				ten = "four";
			} else if (a / 10 == 5) {
				ten = "five";
			} else if (a / 10 == 6) {
				ten = "six";
			} else if (a / 10 == 7) {
				ten = "seven";
			} else if (a / 10 == 8) {
				ten = "eight";
			} else if (a / 10 == 9) {
				ten = "nine";
			}
			return sing + "-" + ten;

		}
		else if (a>99 & a<1000) {
			if (a/100==1) {
				hund="one";
			}else if (a % 100 == 2) {
				hund = "two";
			} else if (a / 10 == 3) {
				hund = "three";
			} else if (a / 10 == 4) {
				hund = "four";
			} else if (a / 10 == 5) {
				hund = "five";
			} else if (a / 10 == 6) {
				hund = "six";
			} else if (a / 10 == 7) {
				hund = "seven";
			} else if (a / 10 == 8) {
				hund = "eight";
			} else if (a / 10 == 9) {
				hund = "nine";
			}
			if (a / 100 == 2) {
				sing = "twenty";
			} else if (a / 100 == 3) {
				sing = "thirty";
			} else if (a / 100 == 4) {
				sing = "fourty";
			} else if (a / 100 == 5) {
				sing = "fifty";
			} else if (a / 100 == 6) {
				sing = "sixty";
			} else if (a / 100 == 7) {
				sing = "seventy";
			} else if (a / 100 == 8) {
				sing = "eighty";
			} else if (a / 100 == 9) {
				sing = "ninety";
			}
			if (a % 100 == 2) {
				ten = "two";
			} else if (a / 100 == 3) {
				ten = "three";
			} else if (a / 100 == 4) {
				ten = "four";
			} else if (a / 100 == 5) {
				ten = "five";
			} else if (a / 100 == 6) {
				ten = "six";
			} else if (a / 100 == 7) {
				ten = "seven";
			} else if (a / 100 == 8) {
				ten = "eight";
			} else if (a / 100 == 9) {
				ten = "nine";
			}
			
			return hund + " hundred and " + sing + "-" + ten;
		}
		return "";
	}
}