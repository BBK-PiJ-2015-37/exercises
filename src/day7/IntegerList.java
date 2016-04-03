public class IntegerList {
	private IntegerNode head;
	
	public IntegerList() {
		head = null;
	}
	
	public IntegerNode getHead() {
		return head;
	}
	
	public void setHead(IntegerNode newHead) {
		head = newHead;
	}
	
	//Adds given integer to linked list of integers
	//in order provided.
	public void addToList(IntegerNode n) {
		if (head == null) {
			head = n;
			return;
		}
		IntegerNode current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(n);
	}
	
	//Adds given integer to linked list of integers
	//in increasing order.
	public void addToSortedList(IntegerNode n) {
		if (head == null) {
			head = n;
			return;
		}
		if (n.getNumber() <= head.getNumber()) {
			n.setNext(head);
			head = n;
			return;
		}
		IntegerNode current = head;
		while ((current.getNext() != null) && (n.getNumber() > current.getNext().getNumber())) {
			current = current.getNext();
		}
		n.setNext(current.getNext());
		current.setNext(n);
	}
	
	public void prettyPrint() {
		IntegerNode current = head;
		while (current != null) {
			System.out.print(" " + current.getNumber());
			current = current.getNext();
		}
		System.out.println();
	}
}