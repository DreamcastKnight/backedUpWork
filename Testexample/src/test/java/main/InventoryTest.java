package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class InventoryTest {
	Map nepal = new Map(1, "nepal", 2019, false, 800);
	Map france = new Map(1, "sacre blue", 1940, false, 900);
	private Inventory in = new Inventory();

	@Test
	public void testAddInvent() {
		in.addItem(nepal);
		assertEquals("object not added to list", true, in.isItemPresent(nepal));
	}

	@Test
	public void testRemInvent() {
		in.addItem(nepal);
		assertEquals("object not added to list", true, in.isItemPresent(nepal));
		in.remItem(nepal);
		assertEquals("object not removed from list", false, in.isItemPresent(nepal));
	}

	@Test
	public void testRemByNam() {
		in.addItem(france);
		in.addItem(nepal);
		nepal.setName("nepal");
		assertEquals("object named still in list", true, in.isItemPresent(nepal));
		in.remItemByName("nepal");
		assertEquals("object named still in list", false, in.isItemPresent(nepal));
	}

	@Test
	public void testIsItemCheckedOut() {
		in.addItem(nepal);
		nepal.checkedOut = true;
		assertEquals("Item is not showing as checked out", true, in.isItemCheckedOut(nepal));
	}

	@Test
	public void testItemCheckOut() {
		in.addItem(france);
		in.checkOut(france);
		assertEquals("france wasn't checked out", true, in.isItemCheckedOut(france));
	}

	@Test
	public void testItemCheckIn() {
		in.addItem(nepal);
		in.checkOut(nepal);
		assertEquals("nepal wasn't checked out", true, in.isItemCheckedOut(nepal));
		in.checkIn(nepal);
		assertEquals("nepal wasn't checked in", false, in.isItemCheckedOut(nepal));
	}

	@Test
	public void testCheckName() {
		in.addItem(nepal);
		nepal.setName("nepal");
		assertEquals("Item name wrong", "nepal", in.checkName(nepal));
	}

	@Test
	public void testNewName() {
		in.addItem(nepal);
		nepal.setName("nepal");
		in.updateItem("nepal", "NOT NEPAL");
		assertEquals("Item name wrong", "NOT NEPAL", in.checkName(nepal));
	}

}