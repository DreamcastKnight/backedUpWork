package main;

public class Map extends Item {

	public int size;

	public Map(int noOfPages, String name, int datOfPublish, Boolean checkedOut, int size) {
		this.setNoOfPages(noOfPages);
		this.setName(name);
		this.setDateOfPublish(dateOfPublish);
		this.setCheckedOut(checkedOut);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}