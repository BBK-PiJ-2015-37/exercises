public class PointerCheckout implements PersonQueue {
	private Person head;
	
	/**
	 * Adds another person to the queue.
	 */
	public void insert(Person person) {
		if (head == null) {
			head = person;
			System.out.println("Added " + head.getName());
			return;
		}
		person.setNext(head);
		head = person;
		System.out.println("Added " + head.getName());
	}

	/**
	 * Removes a person from the queue.
	 */
	public Person retrieve() {
		if (head == null) {
			System.out.println("Queue empty");
			return null;
		}
		Person current = head;
		if (current.getNext() == null) {
			System.out.println("Removed " + head.getName());
			head = null;
			return current;
		}
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		System.out.println("Removed " + current.getNext().getName());
		Person removed = current.getNext();
		current.setNext(null);
		return removed;
	}
	
	public PointerCheckout() {
		head = null;
	}

}