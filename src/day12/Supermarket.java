public class Supermarket {
	private PointerCheckout checkout;
	
	public Supermarket() {
		checkout = new PointerCheckout();
	}
	
	public PointerCheckout getCheckout() {
		return checkout;
	}
	
	public void addPerson(String next) {
		Person nextPerson = new Person(next);
		checkout.insert(nextPerson);
	}
	
	public Person servePerson() {
		return checkout.retrieve();
	}
	
	public void launch() {
		addPerson("Albert Bachman");
		addPerson("Carol Drew");
		addPerson("Ethel Franks");
		servePerson();
		addPerson("Graham Haroldson");
		servePerson();
		servePerson();
		addPerson("Ian Jinks");
		addPerson("Karen Lipovic");
		servePerson();
		servePerson();
		servePerson();
		servePerson();
	}
	
	public static void main(String[] args) {
		Supermarket lidl = new Supermarket();
		lidl.launch();
	}

}