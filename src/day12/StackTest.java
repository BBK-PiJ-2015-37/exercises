import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StackTest {
	private Stack stack;
	
	@Before
	public void setup() {
		stack = new Stack();
	}
	
	@Test
	public void testsEmptyStackIsEmpty() {
		boolean output = stack.empty();
		assertTrue(output);
	}
	
	@Test
	public void testsNonEmptyStackIsNotEmpty() {
		stack.push(4);
		boolean output = stack.empty();
		assertFalse(output);
	}
	
	@Test
	public void testsAdditionToEmptyStack() {
		stack.push(4);
		int output = stack.getHead().getValue();
		int expected = 4;
		assertEquals(expected, output);
		StackNode output2 = stack.getHead().getNext();
		assertNull(output2);
	}
	
	@Test
	public void testsRemovalFromEmptyStack() {
		int output = stack.pop();
		int expected = -99999999;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsAdditionToEmptyStackThenRemoval() {
		stack.push(4);
		int output = stack.pop();
		int expected = 4;
		assertEquals(expected, output);
		StackNode output2 = stack.getHead();
		assertNull(output2);
	}
	
	@Test
	public void testsAdditionToPopulatedStack() {
		stack.push(4);
		stack.push(5);
		int output = stack.getHead().getValue();
		int expected = 5;
		assertEquals(expected, output);
		int output2 = stack.getHead().getNext().getValue();
		int expected2 = 4;
		assertEquals(expected2, output2);
	}
	
	@Test
	public void testsRemovalFromPopulatedStack() {
		stack.push(4);
		stack.push(5);
		int output = stack.pop();
		int expected = 5;
		assertEquals(expected, output);
		int output2 = stack.getHead().getValue();
		int expected2 = 4;
		assertEquals(expected2, output2);
		StackNode output3 = stack.getHead().getNext();
		StackNode expected3 = null;
		assertEquals(expected3, output3);
	}
}