public interface Library {
	
	int getID(String name);
	
	String getName();
	
	void setMaxBooksPerUser(int max);
	
	int getMaxBooksPerUser();
	
	void addBook(String title, String author);
	
	Book takeBook(String title);
	
	void returnBook(Book book);
	
	int getReaderCount();
	
	int getBookCount();
	
	int getBookBorrowedCount();
}