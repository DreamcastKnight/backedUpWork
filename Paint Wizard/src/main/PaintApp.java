package main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SortingFocusTraversalPolicy;

public class PaintApp {
	 

	public static void main(String[] args) {
		
		List<Paint> paints = new ArrayList<>();
		
		Paint cheapoMax = new Paint("CM", 19.99, 10, 21);
		Paint averageJoes = new Paint("AJ", 17.99, 11, 16);
		Paint thatOneWithTheDog = new Paint("TOWTD", 34.38, 12, 40);
		Paint duluxourousPaints = new Paint("DP", 25.0, 22, 10);

		int size = 176;
		
		
		paints.add(cheapoMax);
		paints.add(averageJoes);
		paints.add(thatOneWithTheDog);
		paints.add(duluxourousPaints);
		
		for(p ; paints) {
			p.method(size);
			
		}

		int cm = (cheapoMax.method(size));
		int aj = (averageJoes.method(size));
		int towtd = (thatOneWithTheDog.method(size));
		int dp = (duluxourousPaints.method(size));
		
		

		int[] paint;
		paint = new int[4];

		paint[0] = cm;
		paint[1] = aj;
		paint[2] = towtd;
		paint[3] = dp;

		for (int i = 0; i < paint.length; i++)
			System.out.println("Paint wasted " + i + " : " + paint[i]);
			System.out.println(Math.min(paint));
	}

	// System.out.println("Cheapo Max waste = " + cm);
	// System.out.println("Average Joes waste = " + aj);
	// System.out.println("That One With The Dog waste = " + towtd);
	// System.out.println("Duluxourous Paints waste = " + dp);

	// if (cm < aj & cm < towtd & cm < dp & cm >= 0) {
	// System.out.println("CheapoMax wasted the least amount of paint");
	// }
	// else if (aj < cm & aj < towtd & aj < dp & aj >= 0) {
	// System.out.println("Average Joes wast" + "ed the least amount of paint");
	// }
	// else if (towtd < aj & towtd < cm & towtd < dp & towtd >= 0) {
	// System.out.println("That One With The Dog wasted the least amount of paint");
	// }
	// else if (dp < aj & dp < towtd & dp < cm & dp >= 0) {
	// System.out.println("Duluxourous Paints wasted the least amount of paint");
	// }

	// }

}
