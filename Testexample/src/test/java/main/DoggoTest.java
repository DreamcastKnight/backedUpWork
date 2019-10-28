package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class DoggoTest {

	private Doggo bailey = new Doggo();

	@Test
	public void test10Doggos() {
		assertEquals("9 doggos not printed", "9", bailey.comp(6, 100));
	}

}
