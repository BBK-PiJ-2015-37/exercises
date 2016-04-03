public class Marks {
	private static int distinctions = 0;
	private static int passes = 0;
	private static int fails = 0;
	private static int invalid = 0;
	private static int total = 0;
	private int mark;
	
	public void classify(int mark) {
		if (mark > 100) {
			invalid++;
		} else if (mark >= 70) {
			distinctions++;
			total++;
		} else if (mark >= 50) {
			passes++;
			total++;
		} else if (mark >= 0) {
			fails++;
			total++;
		} else {
			invalid++;
		}
	}
	
	public void launch(){
		int input;
		do {
			System.out.print("Input a mark: ");
			input = Integer.parseInt(System.console().readLine());
			classify(input);
		} while (!(input == -1));	
		System.out.println("There are " + total + " students: " + distinctions +" distinctions, " + passes + " passes, " + fails + " fails (plus " + (invalid - 1) + " invalid).");
	}
	

	public static void main(String[] args) {
		Marks marks = new Marks();
		marks.launch();
	}
}