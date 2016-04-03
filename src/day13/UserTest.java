import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
	private User user;
	private LibraryImpl library;
	
	@Before
	public void setUp() {
		user = new UserImpl("Anna Franklin");
		library = new LibraryImpl("Reading Central Library");
	}
	
	@Test
	public void testsGetName() {
		String output = user.getName();
		String expected = "Anna Franklin";
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetID() {
		user.register(library);
		int output = user.getID();
		int expected = 1;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsRegister() {
		User user2 = new UserImpl("Ben Howey");
		User user3 = new UserImpl("Carol Dinklage");
		user.register(library);
		user2.register(library);
		int output = user3.register(library);
		int expected = 3;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetLibrary() {
		user.register(library);
		String output = user.getLibrary();
		String expected = "Reading Central Library";
		assertEquals(expected, output);
	}
}