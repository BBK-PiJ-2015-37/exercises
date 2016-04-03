public class PointerCheckout implements PersonQueue {
	private Person head;
	private int size;
	
	/**
	 * Adds another person to the queue.
	 */
	public void insert(Person person) {
		if (head == null) {
			head = person;
			System.out.println("Added " + head.getName());
			size++;
			return;
		}
		person.setNext(head);
		head = person;
		System.out.println("Added " + head.getName());
		size++;
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
			size--;
			return current;
		}
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		System.out.println("Removed " + current.getNext().getName());
		Person removed = current.getNext();
		current.setNext(null);
		size--;
		return removed;
	}
	
	public int getSize() {
		return size;
	}
	
	public Person getHead() {
		return head;
	}
	
	public PointerCheckout() {
		head = null;
		size = 0;
	}

}