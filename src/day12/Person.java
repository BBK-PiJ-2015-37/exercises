public class Person {
	private String name;
	private Person next;
	
	public Person(String name) {
		this.name = name;
		this.next = null;
	}

	/**
     * Returns the name of the person
     */
	public String getName() {
		return name;
	}
	
	/**
     * Returns the person who is next after this person
     */
	public Person getNext() {
		return next;
	}
	
	/**
     * Sets the person to point to the given person
     */
	public void setNext(Person next) {
		this.next = next;
	}
}