public class ListIntSortedList implements IntSortedList {
	private IntNode head;

	class IntNode {
		private int value;
		private IntNode next;
		
		public IntNode(int newNode) {
			this.value = newNode;
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
	
	public ListIntSortedList() {
		head = null;
	}

	/*
	 * Adds a new integer to the list so that the list
	 * remains sorted; a list can contain duplicates.
	 */
	public void add(int intToAdd) {
		if (head == null) {
			IntNode newNode = new IntNode(intToAdd);
			head = newNode;
			System.out.println(intToAdd + " added to list");
		} else if (head.getValue() > intToAdd) {
			IntNode newNode = new IntNode(intToAdd);
			newNode.setNext(head);
			head = newNode;
			System.out.println(intToAdd + " added to list");
		} else {
			IntNode current = head;
			while (current.getNext() != null) {
				if (current.getNext().getValue() < intToAdd) {
					current = current.getNext();
				} else {
					IntNode newNode = new IntNode(intToAdd);
					newNode.setNext(current.getNext());
					current.setNext(newNode);
					System.out.println(intToAdd + " added to list");
					return;
				}
			}
			IntNode newNode = new IntNode(intToAdd);
			current.setNext(newNode);
			System.out.println(intToAdd + " added to list");
		}
	}
	
	/*
	 * Returns true if the number is in the list,
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
		while (current.getNext() != null) {
			current = current.getNext();
			if (current.getValue() == intToFind) {
				return true;
			}
			if (current.getNext() == null) {
				return false;
			}
			if (current.getNext().getValue() > intToFind) {
				return false;
			}
		}
		return false;
	}
	
	/*
	 * Returns a string with the values of the elements
	 * in the list separated by commas.
	 */
	public String toString() {
		String result = "";
		if (head == null) {
			result = "List empty.";
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