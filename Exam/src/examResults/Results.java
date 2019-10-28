package examResults;

public class Results {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float phys = 60;
		float chem = 60;
		float bio = 60;
		float total = (phys + chem + bio);
		float percent = (total / 3);

		GiveResults results = new GiveResults();

		System.out.println(results.Give(phys, chem, bio, total, percent));
	}

}