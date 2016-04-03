import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileCat {
	
	public void launch() {
		System.out.print("Please enter a filename: ");
		String fileName = System.console().readLine();
		try {
			File fileToFind = new File(fileName);
			if (!fileToFind.exists()) {
				System.out.println("No file with that name was found");
			} else {
				System.out.println("File found. Printing contents...");
				try (BufferedReader in = new BufferedReader(new FileReader(fileToFind))) {
					String line;
					while ((line = in.readLine()) != null) {
						System.out.println(line);
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		} catch (SecurityException ex) {
			System.out.println("Access denied.");
		}
	}
	
	public static void main(String[] args) {
		FileCat fc = new FileCat();
		fc.launch();
	}
}