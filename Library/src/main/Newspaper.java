package main;

public class Newspaper extends Item {

	public Newspaper(int noOfPages, String name, int yearOfPublish, Boolean checkedOut, String frontPageArticle, int monthOfPublish, int dateOfPublish) {
		this.setNoOfPages(noOfPages);
		this.setName(name);
		this.frontPageArticle=frontPageArticle;
		this.dateOfPublish=dateOfPublish;
		this.monthOfPublish=monthOfPublish;
		this.setYearOfPublish(yearOfPublish);
	}

	public String frontPageArticle;
	public int dateOfPublish;
	public int monthOfPublish;

	public String getFrontPageArticle() {
		return frontPageArticle;
	}

	public void setFrontPageArticle(String frontPageArticle) {
		this.frontPageArticle = frontPageArticle;
	}

	public int getDateOfPublish() {
		return dateOfPublish;
	}

	public void setDateOfPublish(int dateOfPublish) {
		this.dateOfPublish = dateOfPublish;
	}

	public int getMonthOfPublish() {
		return monthOfPublish;
	}

	public void setMonthOfPublish(int monthOfPublish) {
		this.monthOfPublish = monthOfPublish;
	}

}