public class PatientDouble {
	private String name;
	private int age;
	private String illness;
	private PatientDouble nextPatient;
	private PatientDouble prevPatient;

	public PatientDouble(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
		this.prevPatient = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getIllness() {
		return this.illness;
	}
	
	public void setNext(PatientDouble next) {
		this.nextPatient = next;
	}
	
	public PatientDouble getNext() {
		return this.nextPatient;
	}
	
	public void setPrev(PatientDouble prev) {
		this.prevPatient = prev;
	}
	
	public PatientDouble getPrev() {
		return this.prevPatient;
	}
}
