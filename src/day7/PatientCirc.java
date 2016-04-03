public class PatientCirc {
	private String name;
	private int age;
	private String illness;
	private PatientCirc nextPatient;
	
	public PatientCirc(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
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
	
	public void setNext(PatientCirc next) {
		this.nextPatient = next;
	}
	
	public PatientCirc getNext() {
		return this.nextPatient;
	}
}