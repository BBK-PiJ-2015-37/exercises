import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TempAve {
	
	public void launch() {
		System.out.print("Please enter name of input file: ");
		String inFile = System.console().readLine();
		try (BufferedReader in = new BufferedReader(new FileReader(inFile))) {
			String line;
			String[] temps;
			double total = 0;
			int count = 0;
			while ((line = in.readLine()) != null) {
				temps = new String[line.length()];
				temps = line.split(",");
				double lineTotal = 0;
				int lineCount = 0;
				System.out.print("Line " + (count + 1) + ": ");
				try {
					for (int i = 0; i < temps.length; i++) {
						double current = Double.parseDouble(temps[i].trim());
						lineTotal += current;
						lineCount++;
					}
					double lineAve = 0;
					try {
						lineAve = lineTotal/lineCount;
						System.out.println(lineAve);
					} catch (ArithmeticException ex) {
						System.out.println("Can't divide line by zero");
					}
					total += lineAve;
					count++;
				} catch (NumberFormatException ex) {
					System.out.println("Empty line");
				}
			}
			System.out.print("Total average: ");
			try {
				double totalAve = total/count;
				System.out.println(totalAve);
			} catch (ArithmeticException ex) {
				System.out.println("Can't divide line by zero");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (SecurityException ex) {
			System.out.println("Access denied.");
		}
	}
	
	public static void main(String[] args) {
		TempAve ta = new TempAve();
		ta.launch();
	}
}