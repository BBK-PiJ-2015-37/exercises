/**
 * An implementation of a generic doubly-linked list.
 */
public class DoublyLinkedList<T> {
	private DoublyLinkedListNode head = null;;
	private DoublyLinkedListNode tail = null;
	private int size = 0;
	
	/**
	 * Returns true if the list is empty, false otherwise. 
	 * 
	 * @return true if the list is empty, false otherwise. 
	 */
	public boolean isEmpty() {
		return (size == 0);
	}
	
	/**
	 * Returns the number of items currently in the list.
	 * 
	 * @return the number of items currently in the list.
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Adds an element at the end of the list. 
	 * 
	 * @param newValue the new element to be added.
	 */
	public void add(T newValue) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(newValue);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			DoublyLinkedListNode auxNode = head;
			DoublyLinkedListNode newNodePrev;
			while (auxNode.getNext() != null) {
				auxNode = auxNode.getNext();
			}
			newNodePrev = auxNode;
			auxNode.setNext(newNode);
			auxNode = auxNode.getNext();
			auxNode.setPrev(newNodePrev);
			tail = auxNode;
		}
		size++;
		System.out.println("Node added: " + newNode.getValue());
		return;	
	}
	
	/**
	 * Removes the first instance of a given element from the list.
	 *
	 * If element not found in list, an appropriate message is printed.
	 * 
	 * @param valueToRemove the element to be removed.
	 */
	public void remove(T valueToRemove) {
		System.out.print("Removing " + valueToRemove + "...");
		if (isEmpty()) {
			System.out.println("Value not found.");
			return;
		} else if (size() == 1) {
			if (head.getValue().equals(valueToRemove)) {
				head = null;
				tail = null;
				size--;
				System.out.println("Value removed.");
				return;
			} else {
				System.out.println("Value not found.");
				return;
			}
		} else {
			DoublyLinkedListNode current = head;
			DoublyLinkedListNode prev;
			if (current.getValue().equals(valueToRemove)) {
				head = current.getNext();
				head.setPrev(null);
				current.setNext(null);
				size--;
				System.out.println("Value removed.");
				return;
			}
			while (!current.getNext().getValue().equals(valueToRemove)) {
				current = current.getNext();
				if (current.getNext() == null) {
					System.out.println("Value not found.");
					return;
				}
			}
			if (current.getNext().getValue().equals(tail.getValue())) {
				current.setNext(null);
				tail.setPrev(null);
				tail = current;
			} else {
				current.setNext(current.getNext().getNext());
				prev = current;
				current = current.getNext();
				current.setPrev(prev);
			}
			size--;
			System.out.println("Value removed.");
			return;
		}
	}
	
	/**
	 * Prints the entire list from the head to the tail.
	 */	
	public void printForwards() {
		System.out.println("\nList (Forwards):\n----------------");
		DoublyLinkedListNode current = head;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getNext();
		}
		System.out.println("");
	}
	
	/**
	 * Prints the entire list from the tail to the head.
	 */	
	public void printBackwards() {
		System.out.println("\nList (Backwards):\n------------------");
		DoublyLinkedListNode current = tail;
		while (current != null) {
			System.out.println(current.getValue());
			current = current.getPrev();
	    }
	    System.out.println("");
    }
}