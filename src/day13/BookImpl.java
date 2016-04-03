public class BookImpl implements Book {
	private final String author;
	private final String title;
	private boolean taken;
	
	public BookImpl(String author, String title) {
		this.author = author;
		this.title = title;
		this.taken = false;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public boolean isTaken() {
		return taken;
	}
	
	public void setTaken(boolean isTaken) {
		taken = isTaken;
	}
}