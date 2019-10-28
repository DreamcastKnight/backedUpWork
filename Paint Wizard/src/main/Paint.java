package main;

public class Paint {

	public String name;
	public double cost;
	public int coveragePerLitre;
	public int litreAmount;
	public int maxCoverage;
	public int roomSize;

	public Paint(String name, double cost, int coveragePerLitre, int litreAmount) {
		this.name = name;
		this.cost = cost;
		this.coveragePerLitre = coveragePerLitre;
		this.litreAmount = litreAmount;
		this.maxCoverage = maxCoverage;
		this.roomSize = roomSize;
		maxCoverage = litreAmount * coveragePerLitre;
	}

	public int method(int roomSize) {
		int paintWaste = maxCoverage - roomSize;
		return paintWaste;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getCoveragePerLitre() {
		return coveragePerLitre;
	}

	public void setCoveragePerLitre(int coveragePerLitre) {
		this.coveragePerLitre = coveragePerLitre;
	}

	public int getLitreAmount() {
		return litreAmount;
	}

	public void setLitreAmount(int litreAmount) {
		this.litreAmount = litreAmount;
	}

	public int getRoomSize() {
		return roomSize;
	}

	public void setRoomSize(int roomSize) {
		this.roomSize = roomSize;
	}

}
