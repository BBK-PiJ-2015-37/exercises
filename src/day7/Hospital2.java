public class Hospital2 {
	private Patient2 head;
	
	public void launch() {
		Patient2 p1 = new Patient2("John Smith", 37, "Flu");
		addPatient(p1);
		Patient2 p2 = new Patient2("Betty Grable",52,"Death");
		Patient2 p3 = new Patient2("Karl Kruz",32,"Cancer");
		Patient2 p4 = new Patient2("Harry Coker",45,"Pneumonia");	
		Patient2 p5 = new Patient2("Jane Frank",7,"Leukaemia");
		Patient2 p6 = new Patient2("Patrick Jackson",41,"Frostbite");
		Patient2 p7 = new Patient2("Diana Warren",18,"Influenza");
		Patient2 p8 = new Patient2("Caroline Lancashire",23,"Ebola");
		addPatient(p2);
		addPatient(p3);
		addPatient(p4);
		addPatient(p5);
		printPatients();
		removePatient(p4);
		removePatient(p1);
		printPatients();
		removePatient(p4);
		addPatient(p6);
		addPatient(p7);
		addPatient(p8);
		countPatients();
		printPatients();
	}
	
	public Hospital2() {
		head = null;
	}
	
	public void addPatient(Patient2 newPatient) {
		if (head == null) {
			head = newPatient;
			System.out.println("Patient added: " + newPatient.getName());
			return;
		}
		Patient2 aux = head;
		while (aux.getNext() != null) {
			aux = aux.getNext();
		}
		aux.setNext(newPatient);
		System.out.println("Patient added: " + newPatient.getName());
	}
	
	public void removePatient(Patient2 patient) {
		System.out.println("Deleting " + patient.getName() + "...");
		Patient2 current = head;
		if (head.getName().equals(patient.getName())) {
			head = head.getNext();
			System.out.println("Patient removed.");
			return;
		}
		while (!current.getNext().getName().equals(patient.getName())) {
			current = current.getNext();
			if (current.getNext() == null) {
				System.out.println("Patient not found.");
				return;
			}
		}
		current.setNext(current.getNext().getNext());
		System.out.println("Patient removed.\n");
		return;
	}
	
	public void printPatients() {
		System.out.println("\nPatient List:\n-------------");
		Patient2 current = head;
		while (current != null) {
			System.out.println(current.getName() + ", " + current.getAge() + ", " + current.getIllness());
			current = current.getNext();
	    }
	    System.out.println("");
    }
	
	public void countPatients() {
		int count = 0;
		Patient2 current = head;
		while (current != null) {
			count++;
			current = current.getNext();
	    }
		System.out.println("Number of patients: " + count);
	}
	
	public static void main(String[] args) {
		Hospital2 hospital = new Hospital2();
		hospital.launch();
	}
	
}