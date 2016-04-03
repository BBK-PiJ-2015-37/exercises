public class NumberGetter {
	
	public void getTen() {
		int received = 0;
		double total = 0;
		double next;
		while (received < 10) {
			try {
				System.out.print("Enter a number (" + (received + 1) + "/10): ");
				next = Double.parseDouble(System.console().readLine());
				total = total + next;
				received++;
			} catch (NumberFormatException ex) {
				System.out.println("Sorry, that was not a number.");
			}
		}
		System.out.println("Mean: " + total/10);
	}
	
	public static void main(String[] args) {
		NumberGetter ng = new NumberGetter();
		ng.getTen();
	}
	
}