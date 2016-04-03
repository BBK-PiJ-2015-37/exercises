public class LibraryMock implements Library {
	private String name = "Reading Central Library";
	private int returnedID = 20127864;
	
	public String getName() {
		return name;
	}
	
	public int generateID() {
		return returnedID;
	}
}