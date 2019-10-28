package main;

public class Book extends Item {
	public Book(int noOfPages, String name, int yearOfPublish, Boolean checkedOut, String autherName) {
		this.setNoOfPages(noOfPages);
		this.setName(name);
		this.setYearOfPublish(yearOfPublish);
		this.autherName=autherName;
	}

	public String autherName;

	public Book(String autherName) {
		this.autherName = autherName;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

}