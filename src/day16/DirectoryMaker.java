import java.io.File;

public class DirectoryMaker {
	
	public void launch() {
		System.out.print("What would you like to call your directory?: ");
		String dirName = System.console().readLine();
		try {
			File newDir = new File(dirName);
			boolean wasMade = newDir.mkdir();
			if (!wasMade) {
				System.out.println("Could not make directory with that name.");
			}
		} catch (SecurityException ex) {
			System.out.println("Access denied.");
		}
	}
	
	public static void main(String[] args) {
		DirectoryMaker dm = new DirectoryMaker();
		dm.launch();
	}
}