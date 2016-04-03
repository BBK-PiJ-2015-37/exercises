public class NumberGetterExpanded {
	
	public void getTen() {
		getAny(10);
	}
	
	public void getAny(int numberRequested) {
		int received = 0;
		double total = 0;
		double next;
		while (received < numberRequested) {
			try {
				System.out.print("Enter a number (" + (received + 1) + "/" + numberRequested + "): ");
				next = Double.parseDouble(System.console().readLine());
				total = total + next;
				received++;
			} catch (NumberFormatException ex) {
				System.out.println("Sorry, that was not a number.");
			}
		}
		System.out.println("Mean: " + total/numberRequested);
	}
	
	public void getHowMany() {
		boolean validInput = false;
		int numberToGet = -1;
		while (!validInput) {
			try {
				System.out.print("How many numbers do you want to enter?: ");
				numberToGet = Integer.parseInt(System.console().readLine());
				if (numberToGet < 1) {
					throw new IllegalArgumentException();
				}
				validInput = true;
			} catch (NumberFormatException ex) {
				System.out.println("Sorry, that was not a number.");
			} catch (IllegalArgumentException ex){
				System.out.println("Please enter an integer (1 or greater).");
			}
		}
		getAny(numberToGet);
	}
	
	public static void main(String[] args) {
		NumberGetterExpanded ng = new NumberGetterExpanded();
		System.out.println("First getting ten numbers...");
		ng.getTen();
		System.out.println("\nNow getting user-selected quantity of numbers...");
		ng.getHowMany();
	}
	
}