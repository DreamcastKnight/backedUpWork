package main;


public class Doggo {

	String dogList = "";
	String position;
	int unitI;

	// ArrayList <String> dogList = new ArrayList<String>();

	public String comp(int pos, int noDog) {

		for (int i = 1; i < noDog + 1; i++) {

			if (i == pos) {
				continue;
			} else if (10 < i & i < 20) {
				position = i + "th";
			} else {
				unitI = i % 10;
			}

			if (unitI == 1) {
				position = i + "st";
			} else if (unitI == 2) {
				position = i + "nd";
			} else if (unitI == 3) {
				position = i + "rd";
			} else {
				position = i + "th";
			}

			if (i < noDog) {
				dogList = dogList + position + ", ";
			} else {
				dogList = dogList + position;
			}
		}

		return dogList;
	}
}
