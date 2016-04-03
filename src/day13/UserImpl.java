public class UserImpl implements User {
	private String name;
	private int userID;
	private String library;
	
	public UserImpl(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return userID;
	}
	
	public int register(LibraryImpl library) {
		this.library = library.getName();
		this.userID = library.getID(getName());
		return getID();
	}
	
	public String getLibrary() {
		return library;
	}
}