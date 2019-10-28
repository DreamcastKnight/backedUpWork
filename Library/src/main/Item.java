package main;

public class Item {

	public Item() {
		super();
	}

	public int noOfPages;
	public String name;
	public int yearOfPublish;
	public boolean checkedOut;

	public Item(int noOfPages, String name, int yearOfPublish, boolean checkedOut) {
		this.noOfPages = noOfPages;
		this.name = name;
		this.yearOfPublish = yearOfPublish;
		this.checkedOut = checkedOut;

	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}

	public boolean getCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}

}
