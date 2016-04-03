import java.io.File;

public class FileLister {
	
	public void launch() {
		try {
			String currentDir = "." + File.separator;
			File file = new File(currentDir);
			String[] fileList = file.list();
			for (int i = 0; i < fileList.length; i++) {
				System.out.println(fileList[i]);
			}
		} catch (NullPointerException ex) {
			System.out.println("No directory available.");
		} catch (SecurityException ex) {
			System.out.println("Access to directory denied.");
		}
		
	}
	
	public static void main(String[] args) {
		FileLister fl = new FileLister();
		fl.launch();
	}
	
}