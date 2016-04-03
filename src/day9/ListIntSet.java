public class ListIntSet implements IntSet {
	private IntNode head;
	
	class IntNode {
		private int value;
		private IntNode next;
		
		public IntNode(int newValue) {
			this.value = newValue;
			this.next = null;
		}
		
		public int getValue() {
			return this.value;
		}
		
		public IntNode getNext() {
			return this.next;
		}
		
		public void setNext(IntNode nextNode) {
			this.next = nextNode;
		}
	}
	
	public ListIntSet() {
		this.head = null;
	}

	/*
	 * Adds an integer to the set.
	 * Does nothing if integer already in set.
	 */
	public void add(int intToAdd) {
		if (head == null) {
			IntNode newNode = new IntNode(intToAdd);
			head = newNode;
			System.out.println(intToAdd + " added to list.");	
			return;
		}
		if (!(contains(intToAdd))){
			IntNode current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			IntNode newNode = new IntNode(intToAdd);
			current.setNext(newNode);
			System.out.println(intToAdd + " added to list.");	
		}
	}

	/*
	 * Returns true if integer already in set,
	 * false otherwise.
	 */
	public boolean contains(int intToFind) {
		if (head == null) {
			return false;
		}
		if (head.getValue() == intToFind) {
			return true;
		}
		IntNode current = head;
		while ((current.getNext() != null)) {
			current = current.getNext();
			if (current.getValue() == intToFind) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Returns true if integer already in set,
	 * false otherwise. Prints elements as
	 * they are checked.
	 */
	public boolean containsVerbose(int intToFind) {
		if (head == null) {
			return false;
		}
		System.out.println("Checking next element... Value is " + head.getValue() + ".");
		if (head.getValue() == intToFind) {
			return true;
		}
		IntNode current = head;
		while ((current.getNext() != null)) {
			current = current.getNext();
			System.out.println("Checking next element... Value is " + current.getValue() + ".");
			if (current.getValue() == intToFind) {
				return true;
			}
		}	
		return false;
	}
	
	/*
	 * Returns a string with values of the elements
	 * in the set separated by commas.
	 */
	public String toString() {
		String result = "";
		if (head == null) {
			result = "Set empty.";
			return result;
		}
		IntNode current = head;
		result = current.getValue() + ",";
		while (current.getNext() != null) {
			result = result + current.getNext().getValue() + ",";
			current = current.getNext();
		}
		return result.substring(0,result.length()-1);
	}
}