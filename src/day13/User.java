public interface User {
	
	String getName();
	
	int getID();
	
	int register(LibraryImpl library);
	
	String getLibrary();
}