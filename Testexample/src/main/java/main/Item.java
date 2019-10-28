package main;

public class Item {

	public Item() {
		super();
	}

	public int noOfPages;
	public String name;
	public int dateOfPublish;
	public boolean checkedOut;

	public Item(int noOfPages, String name, int dateOfPublish, boolean checkedOut) {
		this.noOfPages = noOfPages;
		this.name = name;
		this.dateOfPublish = dateOfPublish;
		this.checkedOut=checkedOut;
		
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

	public int getDateOfPublish() {
		return dateOfPublish;
	}

	public void setDateOfPublish(int dateOfPublish) {
		this.dateOfPublish = dateOfPublish;
	}

	public boolean getCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	

}
