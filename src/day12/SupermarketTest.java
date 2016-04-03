import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SupermarketTest {
	private Supermarket tesco;
	
	@Before
	public void setup() {
		tesco = new Supermarket();
	}
	
	@Test
	public void testsAdditionToEmptyQueue() {
		String input = "Robert Owen";
		tesco.addPerson(input);
		String output = tesco.getCheckout().getHead().getName();
		String expected = "Robert Owen";
		assertEquals(expected, output);
		int output2 = tesco.getCheckout().getSize();
		int expected2 = 1;
		assertEquals(expected2, output2);
	}
	
	@Test
	public void testsRemovalFromEmptyQueue() {
		Person output = tesco.servePerson();
		assertNull(output);
	}
	
	@Test
	public void testsAdditionToOnePersonQueue() {
		String input = "Robert Owen";
		tesco.addPerson(input);
		input = "Terry Fisher";
		tesco.addPerson(input);
		String output = tesco.getCheckout().getHead().getName();
		String expected = "Terry Fisher";
		assertEquals(expected, output);
		String output2 = tesco.getCheckout().getHead().getNext().getName();
		String expected2 = "Robert Owen";
		assertEquals(expected2, output2);
		int output3 = tesco.getCheckout().getSize();
		int expected3 = 2;
		assertEquals(expected3, output3);
	}
	
	@Test
	public void testsRemovalFromOnePersonQueue() {
		String input = "Robert Owen";
		tesco.addPerson(input);
		Person served = tesco.servePerson();
		String output = served.getName();
		String expected = "Robert Owen";
		assertEquals(expected, output);
		int output2 = tesco.getCheckout().getSize();
		int expected2 = 0;
		assertEquals(expected2, output2);
		Person output3 = tesco.getCheckout().getHead();
		assertNull(output3);
	}
	
	@Test
	public void testsRemovalFromTwoPersonQueue() {
		String input = "Robert Owen";
		tesco.addPerson(input);
		input = "Terry Fisher";
		tesco.addPerson(input);
		Person served = tesco.servePerson();
		String output = served.getName();
		String expected = "Robert Owen";
		assertEquals(expected, output);
		String output2 = tesco.getCheckout().getHead().getName();
		String expected2 = "Terry Fisher";
		assertEquals(expected2, output2);
		int output3 = tesco.getCheckout().getSize();
		int expected3 = 1;
		assertEquals(expected3, output3);
	}
	
}