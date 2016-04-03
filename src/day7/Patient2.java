public class Patient2 {
	private String name;
	private int age;
	private String illness;
	private Patient2 nextPatient;
	
	public Patient2(String name, int age, String illness) {
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
	
	public void setNext(Patient2 next) {
		this.nextPatient = next;
	}
	
	public Patient2 getNext() {
		return this.nextPatient;
	}
}