import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
	private Book book;
	
	@Before
	public void setUp() {
		book = new BookImpl("Wilkie Collins", "The Moonstone");
	}
	
	@Test
	public void testsGetAuthor() {
		String output = book.getAuthor();
		String expected = "Wilkie Collins";
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetTitle() {
		String output = book.getTitle();
		String expected = "The Moonstone";
		assertEquals(expected, output);
	}
}