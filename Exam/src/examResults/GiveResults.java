package examResults;

public class GiveResults {

	public float Give(float phys, float chem, float bio, float total, float percent) {
		System.out.println("Your physics result is " + phys);

		System.out.println("Your chemistry result is " + chem);

		System.out.println("Your Biology result is " + bio);

		System.out.println("Your total number of marks is " + total);

		if (percent < 60 | phys < 60 | chem < 60 | bio < 60) {
			System.out.println("YOU FAILED");
			if (phys < 60) {
				System.out.println("You failed Physics");
			}
			if (chem < 60) {
				System.out.println("You failed Chemistry");
			}
			if (bio < 60) {
				System.out.println("You failed Biology");
			}
		} else
			System.out.println("YOU PASSED!");
		System.out.println("Your percentage overall is ");
		return (percent);
	}
}
