public class UniStaff {
	
	public static void main(String[] args) {
		UniStaff birkbeck = new UniStaff();
		birkbeck.launch();
	}
	
	public void launch() {
		Lecturer newLecturer = new Lecturer("John Smith");
		System.out.println(newLecturer.getName());
		newLecturer.teach("Biology");
		newLecturer.doResearch("Cellular decomposition");
		
	}
}