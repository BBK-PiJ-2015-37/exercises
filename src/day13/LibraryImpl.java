public class LibraryImpl implements Library {
	private String name;
	private String[] userNameArray;
	private Book[] bookCollection;
	private int arraySize;
	private int collectionSize;
	private int userCount;
	private int maxBooksPerUser;
	private int bookCount;
	private int borrowedCount;
	
	public LibraryImpl(String name) {
		this.name = name;
		this.userNameArray = new String[10];
		this.bookCollection = new Book[10];
		this.arraySize = 10;
		this.collectionSize = 10;
		this.userCount = 0;
		this.maxBooksPerUser = 3;
		this.bookCount = 0;
		this.borrowedCount = 0;
	}
	
	public int getID(String name) {
		if (arrayNearFull()) {
			doubleArraySize();
		}
		if (userCount != 0) {
			for (int i = 0; i < userCount; i++) {
				String current = userNameArray[i];
				if (current.equals(name)) {
					return i + 1;
				}
			}
		}
		userNameArray[userCount] = name;
		userCount++;
		return userCount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMaxBooksPerUser(int max) {
		maxBooksPerUser = max;
	}
	
	public int getMaxBooksPerUser() {
		return maxBooksPerUser;
	}
	
	public void addBook(String title, String author) {
		if (collectionNearFull()) {
			doubleCollectionSize();
		}
		Book added = new BookImpl(title, author);
		bookCollection[bookCount] = added;
		bookCount++;
	}
	
	public Book takeBook(String title) {
		if (bookCount != 0) {
			for (int i = 0; i < bookCount; i++) {
				if (bookCollection[i].getTitle().equals(title)) {
					Book taken = bookCollection[i];
					if (!taken.isTaken()) {
						taken.setTaken(true);
						borrowedCount++;
						return taken;
					}
				}
			}
		}
		return null;
	}
	
	public void returnBook(Book book) {
		if (bookCount != 0) {
			for (int i = 0; i < bookCount; i++) {
				if (bookCollection[i].getTitle().equals(book.getTitle())) {
					Book taken = bookCollection[i];
					taken.setTaken(false);
					borrowedCount--;
				}
			}
		}
	}
	
	public int getReaderCount() {
		return userCount;
	}
	
	public int getBookCount() {
		return bookCount;
	}
	
	public int getBookBorrowedCount() {
		return borrowedCount;
	}
	
	private boolean arrayNearFull() {
		if (arraySize - userCount <= 1) {
			return true;
		}
		return false;
	}
	
	private void doubleArraySize() {
		String[] biggerArray = new String[arraySize * 2];
		for (int i = 0; i < userCount; i++) {
			biggerArray[i] = userNameArray[i];
		}
		userNameArray = biggerArray;
		arraySize = arraySize * 2;
	}
	
	private boolean collectionNearFull() {
		if (collectionSize - bookCount <= 1) {
			return true;
		}
		return false;
	}
	
	private void doubleCollectionSize() {
		Book[] biggerArray = new Book[collectionSize * 2];
		for (int i = 0; i < bookCount; i++) {
			biggerArray[i] = bookCollection[i];
		}
		bookCollection = biggerArray;
		collectionSize = collectionSize * 2;
	}
}