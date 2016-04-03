public class Hospital{
	private Patient patientListStart = null;
	
	public void launch(){
		Patient patient1 = new Patient("John Smith",64,"Cold");
		patientListStart = patient1;
		Patient patient2 = new Patient("Betty Grable",52,"Death");
		Patient patient3 = new Patient("Karl Kruz",32,"Cancer");
		Patient patient4 = new Patient("Harry Coker",45,"Pneumonia");	
		Patient patient5 = new Patient("Jane Frank",7,"Leukaemia");	
		Patient patient6 = new Patient("Lily Gould",21,"Broken Arm");	
		Patient patient7 = new Patient("Charles Digweed",31,"Dehydration");
		Patient patient8 = new Patient("Pauline Jinx",98,"Oldness");	
		Patient patient9 = new Patient("Farhud Manzoori",28,"All");	
		Patient patient10 = new Patient("Sam Jansen",26,"None");
		patientListStart.addPatient(patient2);
		patientListStart.addPatient(patient3);
		patientListStart.addPatient(patient4);
		patientListStart.addPatient(patient5);
		patientListStart.addPatient(patient6);
		patientListStart.addPatient(patient7);
		patientListStart.addPatient(patient8);
		patientListStart.addPatient(patient9);
		patientListStart.addPatient(patient10);
		patientListStart.printPatient();
		System.out.println(patientListStart.countPatients());
		System.out.println("");
		patientListStart = patient2;
		patientListStart.deletePatient(patient9);
		patientListStart.deletePatient(patient10);
		patientListStart.printPatient();
		System.out.println(patientListStart.countPatients());
	}
	public static void main(String[] args) {
		Hospital hospital = new Hospital();
		hospital.launch();
	}
}