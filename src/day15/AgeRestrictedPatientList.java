import java.util.ArrayList;
import java.util.List;

public class AgeRestrictedPatientList {
	private List<AgeRestrictedPatient> patientList = new ArrayList<>();
	
	public void run() {
		boolean finished = false;
		int choice = -1;
		while (!finished) {
			boolean validChoice = false;
			while (!validChoice) {
				System.out.print("What would you like to do?\n\t1 - Add a patient\n\t2 - Print patient list\n\t0 - Quit\nChoice: ");
				String input = System.console().readLine();
				if (!((input.equals("0")) || (input.equals("1")) || (input.equals("2")))) {
					System.out.println("Please enter 0, 1 or 2");
				} else {
					choice = Integer.parseInt(input);
					validChoice = true;
				}
			}
			switch (choice) {
				case 0:
						finished = true;
						System.out.println("Goodbye!");
						break;
				case 1:
						addPatient();
						break;
				case 2:
						printList();
						break;
			}
		}	
	}
	
	public void addPatient() {
		String name;
		int yearOfBirth = -1;
		boolean validAge = false;
		AgeRestrictedPatient newPatient;
		System.out.print("Patient name: ");
		name = System.console().readLine();
		while (!validAge) {
			boolean validInput = false;
			while (!validInput) {
				System.out.print("Patient year of birth: ");
				try {
					yearOfBirth = Integer.parseInt(System.console().readLine());
					validInput = true;
				} catch (NumberFormatException ex) {
					System.out.println("Invalid input - please enter year of birth.");
				}
			}
			try {
				newPatient = new AgeRestrictedPatient(name, yearOfBirth);
				patientList.add(newPatient);
				validAge = true;
			} catch (IllegalArgumentException ex) {
				System.out.println("Patient age should be between 0 and 130.");
			} 
		}
	}
	
	public void printList() {
		for (int i = 0; i < patientList.size(); i++) {
			AgeRestrictedPatient current = patientList.get(i);
			System.out.println(current.getName() + ", " + current.getYOB());
		}
	}
	
	public static void main(String[] args) {
		AgeRestrictedPatientList list = new AgeRestrictedPatientList();
		list.run();
	}
}