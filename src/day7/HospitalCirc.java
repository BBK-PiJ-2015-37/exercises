public class HospitalCirc {
	private PatientCirc head;
	private PatientCirc tail;
	
	public void launch() {
		PatientCirc p1 = new PatientCirc("John Smith", 37, "Flu");
		addPatient(p1);
		PatientCirc p2 = new PatientCirc("Betty Grable",52,"Death");
		PatientCirc p3 = new PatientCirc("Karl Kruz",32,"Cancer");
		PatientCirc p4 = new PatientCirc("Harry Coker",45,"Pneumonia");	
		PatientCirc p5 = new PatientCirc("Jane Frank",7,"Leukaemia");
		PatientCirc p6 = new PatientCirc("Patrick Jackson",41,"Frostbite");
		PatientCirc p7 = new PatientCirc("Diana Warren",18,"Influenza");
		PatientCirc p8 = new PatientCirc("Caroline Lancashire",23,"Ebola");
		addPatient(p2);
		addPatient(p3);
		addPatient(p4);
		addPatient(p5);
		printPatientList();
		removePatient(p5);
		removePatient(p1);
		printPatientList();
		removePatient(p5);
		addPatient(p6);
		addPatient(p7);
		addPatient(p8);
		printPatientList();
	}
	
	public HospitalCirc() {
		head = null;
		tail = null;
	}
	
	public void addPatient(PatientCirc newPatient) {
		if (head == null) {
			head = newPatient;
			tail = head;
			tail.setNext(head);
			System.out.println("Patient added: " + newPatient.getName());
			return;
		}
		PatientCirc aux = head;
		while (aux.getNext() != head) {
			aux = aux.getNext();
		}
		aux.setNext(newPatient);
		aux = aux.getNext();
		tail = aux;
		tail.setNext(head);
		System.out.println("Patient added: " + newPatient.getName());
	}
	
	public void removePatient(PatientCirc patient) {
		System.out.println("Deleting " + patient.getName() + "...");
		PatientCirc current = head;
		if (head.getName().equals(patient.getName())) {
			head = head.getNext();
			tail.setNext(head);
			System.out.println("Patient removed.");
			return;
		}
		while (!current.getNext().getName().equals(patient.getName())) {
			current = current.getNext();
			if ((current.getNext() == tail) && (tail.getName().equals(patient.getName()))) {
				current.setNext(head);
				tail = current;
				System.out.println("Patient removed.");
				return;
			}
			if (current.getNext() == head) {
				System.out.println("Patient not found.");
				return;
			}
		}
		current.setNext(current.getNext().getNext());
		System.out.println("Patient removed.\n");
		return;
	}
	
	public void printPatient(PatientCirc patient) {
		System.out.println(patient.getName() + ", " + patient.getAge() + ", " + patient.getIllness());
	}
	
	public void printPatientList() {
		System.out.println("\nPatient List:\n-------------");
		printPatient(head);
		PatientCirc current = head.getNext();
		while (current != head) {
			printPatient(current);
			current = current.getNext();
	    }
	    System.out.println("");
    }
	
	public static void main(String[] args) {
		HospitalCirc hospital = new HospitalCirc();
		hospital.launch();
	}
	
}