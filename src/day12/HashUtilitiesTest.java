import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class HashUtilitiesTest {
	
	HashUtilities hu;
	
	@Before
	public void setUp() {
		hu = new HashUtilities();
	}
	
	@Test
	public void testsInRange() {
		for (int i = 0; i < 20000; i++) {
			int input = (int)(Math.random() * 100000000);
			int output = hu.shortHash(input);
			boolean expected = (output >= 0 && output <= 999);
			assertTrue("Out of range", expected);
		}
	}
	
	@Test
	public void testsPositiveInteger() {
		int input = 1273;
		int output = hu.shortHash(input);
		int expected = 273;
		assertEquals(expected, output);
	}
	
	@Test
	public void tests0() {
		int input = 0;
		int output = hu.shortHash(input);
		int expected = 0;
		assertEquals(expected, output);
	}
	
	@Test
	public void tests1() {
		int input = 3001;
		int output = hu.shortHash(input);
		int expected = 1;
		assertEquals(expected, output);
	}
	
	@Test
	public void tests999() {
		int input = 3999;
		int output = hu.shortHash(input);
		int expected = 999;
		assertEquals(expected, output);
	}
	
	@Test
	public void tests1000() {
		int input = 1000;
		int output = hu.shortHash(input);
		int expected = 0;
		assertEquals(expected, output);
	}
}