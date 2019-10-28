package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
	Person jack= new Person();
	
	@Test
	public void testRegAcc() {
		jack.setRegistered(false);
		jack.registerAcc();
		assertEquals("account was not registered",true,jack.isAccReg());
	}
	
	@Test
	public void testUnegAcc() {
		jack.setRegistered(true);
		jack.unRegisterAcc();
		assertEquals("account is still registered",false,jack.isAccReg());
	}
	
	@Test
	public void testUpName() {
		jack.setName("jack");
		assertEquals("name not changed","ahhhhhhh",jack.updateName("ahhhhhhh"));
	}
	
}
