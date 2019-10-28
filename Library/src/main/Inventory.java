package main;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	public Inventory() {
		super();
	}

	private List<Item> inLibrary = new ArrayList<Item>();

	public boolean addItem(Item item) {
		return this.inLibrary.add(item);
	}

	public boolean remItem(Item item) {
		return this.inLibrary.remove(item);
	}

	public void printAll() {
		for (Item p : this.inLibrary) {
			System.out.println(p);
		}
	}

	public boolean checkOut(Item item) {
		if (item.getCheckedOut() == false) {
			item.setCheckedOut(true);
			return item.getCheckedOut();
		} else
			return false;
	}

	public boolean checkIn(Item item) {
		if (item.getCheckedOut() == true) {
			item.setCheckedOut(false);
			return item.getCheckedOut();
		} else
			return true;
	}

	public boolean isItemCheckedOut(Item item) {
		if (item.getCheckedOut() == true) {
			return true;
		} else
			return false;
	}

	public boolean isItemPresent(Item item) {
		if (inLibrary.contains(item)) {
			return true;
		} else
			return false;
	}

	public void remItemByName(String name) {
		for (Item i : inLibrary) {
			if (i.getName().equalsIgnoreCase(name)) {
				inLibrary.remove(i);
			}
		}
	}

	public String checkName(Item item) {
		return item.getName();
	}

	public void updateItem(String name, String newname) {
		for (Item i : inLibrary) {
			if (i.getName().equalsIgnoreCase(name)) {
				i.setName(newname);
			}
		}
	}

}