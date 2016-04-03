import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest1 {
	@Test
	public void testsNormalName() {
		Person1 p = new Person1();
		String input = "Barack Henry Obama";
		String output = p.getInitials(input);
		String expected = "BHO";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsNameWithDoubleSpace() {
		Person1 p = new Person1();
		String input = "Barack Henry  Obama";
		String output = p.getInitials(input);
		String expected = "BHO";
		assertEquals(output, expected);
	}
	
	@Test
	public void testsNameWithMultipleSpaces() {
		Person1 p = new Person1();
		String input = "Barack        Henry     Obama";
		String output = p.getInitials(input);
		String expected = "BHO";
		assertEquals(output, expected);
	}
}