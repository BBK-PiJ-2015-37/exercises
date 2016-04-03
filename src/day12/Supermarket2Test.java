import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Supermarket2Test {
	private Supermarket2 tesco;
	
	@Before
	public void setup() {
		tesco = new Supermarket2();
	}
	
	@Test
	public void testsAdditionToEmptyQueue() {
		String input = "Robert Owen";
		tesco.addPerson(input);
		StringArrayCheckout queue = tesco.getCheckout();
		String output = queue.getNext();
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
		StringArrayCheckout queue = tesco.getCheckout();
		String output = queue.getNext();
		String expected = "Robert Owen";
		assertEquals(expected, output);
		int output2 = tesco.getCheckout().getSize();
		int expected2 = 2;
		assertEquals(expected2, output2);
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
		StringArrayCheckout queue = tesco.getCheckout();
		String output3 = queue.getNext();
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
		StringArrayCheckout queue = tesco.getCheckout();
		String output2 = queue.getNext();
		String expected2 = "Terry Fisher";
		assertEquals(expected2, output2);
		int output3 = tesco.getCheckout().getSize();
		int expected3 = 1;
		assertEquals(expected3, output3);
		//passes
	}
}