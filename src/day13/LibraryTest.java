import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class LibraryTest {
	private Library library;
	
	@Before
	public void setUp() {
		library = new LibraryImpl("Reading Central Library");
	}
	
	@Test
	public void testsGetName() {
		String output = library.getName();
		String expected = "Reading Central Library";
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetIDWithNewName() {
		library.getID("Anna Franklin");
		library.getID("Carol Dinklage");
		int output = library.getID("Ben Howey");
		int expected = 3;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetIDWithExistingName() {
		library.getID("Anna Franklin");
		library.getID("Ben Howey");
		library.getID("Carol Dinklage");
		int output = library.getID("Ben Howey");
		int expected = 2;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsDoubleArraySize() {
		library.getID("A");
		library.getID("B");
		library.getID("C");
		library.getID("D");
		library.getID("E");
		library.getID("F");
		library.getID("G");
		library.getID("H");
		library.getID("I");
		library.getID("J");
		library.getID("K");
		int output = library.getID("Ben Howey");
		int expected = 12;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetMaxBooksPerUser() {
		int output = library.getMaxBooksPerUser();
		int expected = 3;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsSetMaxBooksPerUser() {
		library.setMaxBooksPerUser(5);
		int output = library.getMaxBooksPerUser();
		int expected = 5;
		assertEquals(expected, output);
	}
	
	@Test
	public void testsAddBookThenTakeBook() {
		library.addBook("Wilkie Collins", "The Moonstone");
		String output = library.takeBook("The Moonstone").getAuthor();
		String expected = "Wilkie Collins";
		assertEquals(expected, output);
	}
	
	@Test
	public void testsTakeBookThatAlreadyTaken() {
		library.addBook("Wilkie Collins", "The Moonstone");
		library.takeBook("The Moonstone");
		assertNull(library.takeBook("The Moonstone"));
	}
	
	@Test
	public void testsTakeBookThatDoesNotExist() {
		assertNull(library.takeBook("Bleak House"));
	}
	
	@Test
	public void testsTakeBookThatIsReturned() {
		library.addBook("Wilkie Collins", "The Moonstone");
		Book taken = library.takeBook("The Moonstone");
		library.returnBook(taken);
		String output = library.takeBook("The Moonstone").getAuthor();
		String expected = "Wilkie Collins";
		assertEquals(expected, output);
	}
	
	@Test
	public void testsGetReaderCountWithZeroReaders() {
		int output = library.getReaderCount();
		assertEquals(0, output);
	}
	
	@Test
	public void testsGetReaderCountWithThreeReaders() {
		library.getID("Anna Franklin");
		library.getID("Ben Howey");
		library.getID("Carol Dinklage");
		int output = library.getReaderCount();
		assertEquals(3, output);
	}
	
	@Test
	public void testsGetBookCountWithZeroBooks() {
		int output = library.getBookCount();
		assertEquals(0, output);
	}
	
	@Test
	public void testsGetBookCountWithThreeBooks() {
		library.addBook("Wilkie Collins", "The Moonstone");
		library.addBook("Charles Dickens", "Bleak House");
		library.addBook("Jane Austen", "Persuasion");
		int output = library.getBookCount();
		assertEquals(3, output);
	}
	
	@Test
	public void testsGetBookBorrowedCountWithZeroBorrowedBooks() {
		int output = library.getBookBorrowedCount();
		assertEquals(0, output);
	}
	
	@Test
	public void testsGetBookBorrowedCountWithTwoBorrowedBooks() {
		library.addBook("Wilkie Collins", "The Moonstone");
		library.addBook("Charles Dickens", "Bleak House");
		library.addBook("Jane Austen", "Persuasion");
		library.takeBook("The Moonstone");
		library.takeBook("Persuasion");
		int output = library.getBookBorrowedCount();
		assertEquals(2, output);
	}
	
	@Test
	public void testsGetBookBorrowedCountWithTwoBorrowedBooksThenReturned() {
		library.addBook("Wilkie Collins", "The Moonstone");
		library.addBook("Charles Dickens", "Bleak House");
		library.addBook("Jane Austen", "Persuasion");
		Book taken1 = library.takeBook("The Moonstone");
		Book taken2 = library.takeBook("Persuasion");
		library.returnBook(taken1);
		library.returnBook(taken2);
		int output = library.getBookBorrowedCount();
		assertEquals(0, output);
	}
}