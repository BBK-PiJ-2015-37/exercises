import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopy {
	
	public void launch() {
		System.out.print("Please enter name of input file: ");
		String file1 = System.console().readLine();
		System.out.print("Please enter name of output file: ");
		String file2 = System.console().readLine();
		File inFile = null;
		File outFile = null;
		try {
			inFile = new File(file1);
			outFile = new File(file2);
			if (!inFile.exists()) {
				System.out.println("Input file does not exist.");
				return;
			}
			if (outFile.exists()) {
				if (!verifyOutputFileOverwrite()) {
					return;
				}	
			}
		} catch (SecurityException ex) {
			System.out.println("Access denied.");
		}
		try (BufferedReader in = new BufferedReader(new FileReader(inFile));
			PrintWriter out = new PrintWriter(outFile)) {
			String line;
			while ((line = in.readLine()) != null) {
				out.write(line);
				out.println();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}		
	}
	
	private boolean verifyOutputFileOverwrite() {
		System.out.print("Output file already exists. Do you want to overwrite it? ");
		boolean validAnswer = false;
		boolean verified = false;
		while (!validAnswer) {
			System.out.print("Enter Y/N: ");
			String ans = System.console().readLine();
			if (ans.equals("N")) {
				System.out.println("Exiting...");
				validAnswer = true;
			} else if (ans.equals("Y")) {
				validAnswer = true;
				verified = true;
			}
		}
		return verified;
	}
	
	public static void main(String[] args) {
		FileCopy fc = new FileCopy();
		fc.launch();
	}
}