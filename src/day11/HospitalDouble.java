public class HospitalDouble {
	private PatientDouble head;
	private PatientDouble tail;
	
	public HospitalDouble() {
		head = null;
		tail = null;
	}
	
	public void launch() {
		PatientDouble p1 = new PatientDouble("John Smith", 37, "Flu");
		addPatient(p1);
		PatientDouble p2 = new PatientDouble("Betty Grable",52,"Death");
		PatientDouble p3 = new PatientDouble("Karl Kruz",32,"Cancer");
		PatientDouble p4 = new PatientDouble("Harry Coker",45,"Pneumonia");	
		PatientDouble p5 = new PatientDouble("Jane Frank",7,"Leukaemia");
		PatientDouble p6 = new PatientDouble("Patrick Jackson",41,"Frostbite");
		PatientDouble p7 = new PatientDouble("Diana Warren",18,"Influenza");
		PatientDouble p8 = new PatientDouble("Caroline Lancashire",23,"Ebola");
		addPatient(p2);
		addPatient(p3);
		addPatient(p4);
		addPatient(p5);
		printForwards();
		printBackwards();
		removePatient(p4);
		removePatient(p1);
		printForwards();
		printBackwards();
		addPatient(p6);
		addPatient(p7);
		addPatient(p8);
		removePatient(p1);
		printForwards();
		printBackwards();
	}
	
	public void addPatient(PatientDouble newPatient) {
		if (head == null) {
			head = newPatient;
			tail = newPatient;
			System.out.println("Patient added: " + newPatient.getName());
			return;
		}
		PatientDouble aux = head;
		PatientDouble prev;
		while (aux.getNext() != null) {
			aux = aux.getNext();
		}
		prev = aux;
		aux.setNext(newPatient);
		aux = aux.getNext();
		aux.setPrev(prev);
		tail = aux;
		System.out.println("Patient added: " + newPatient.getName());
		return;
	}

	public void removePatient(PatientDouble patient) {
		System.out.println("Deleting " + patient.getName() + "...");
		PatientDouble current = head;
		PatientDouble prev;
		if (head.getName().equals(patient.getName())) {
			head = head.getNext();
			head.setPrev(null);
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
		prev = current;
		current = current.getNext();
		current.setPrev(prev);
		System.out.println("Patient removed.\n");
		return;
	}

	public void printForwards() {
		System.out.println("\nPatient List (Forwards):\n-------------------------");
		PatientDouble current = head;
		while (current != null) {
		System.out.println(current.getName() + ", " + current.getAge() + ", " + current.getIllness());
			current = current.getNext();
	    }
	    System.out.println("");
    }

	public void printBackwards() {
		System.out.println("\nPatient List (Backwards):\n-------------------------");
		PatientDouble current = tail;
		while (current != null) {
		System.out.println(current.getName() + ", " + current.getAge() + ", " + current.getIllness());
			current = current.getPrev();
	    }
	    System.out.println("");
    }
	
	public static void main(String[] args) {
		HospitalDouble hospital = new HospitalDouble();
		hospital.launch();
	}
}