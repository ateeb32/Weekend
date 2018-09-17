package test;

import static org.junit.Assert.*;

import org.junit.Test;

import code.MainClass;

public class WeekendTests {
	
	MainClass mc = new MainClass(); // Calls the MainClass class

	@Test
	public void partOneTest() {
		
		assertFalse(mc.partOne("Tuffjeffium", "T")); // One letter symbol should be invalid
		assertFalse(mc.partOne("Sveggjerium", "Ss")); // Same symbol letter twice that does not appear twice in the element should be invalid
		assertFalse(mc.partOne("Silver", "Rv")); // V is before the R so "Rv" is invalid
		
		assertTrue(mc.partOne("Sveggjerium", "Ee"));
		assertTrue(mc.partOne("Zockurijirium", "Zr"));
		assertTrue(mc.partOne("Jeffkanium", "Kn"));
		assertFalse(mc.partOne("Jefftzlon", "Zt"));
		assertFalse(mc.partOne("Jeffntzum", "Nn"));
		assertFalse(mc.partOne("Tuffjeffium", "Ty"));
		
	}

}
