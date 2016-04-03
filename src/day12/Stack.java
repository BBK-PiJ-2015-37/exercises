public class Stack {
	private StackNode head;
	
	public Stack() {
		head = null;
	}
	
	public StackNode getHead() {
		return head;
	}
	
	//Pushes element to top of stack.
	//Sets element as stack head if stack empty.
	public void push(int n) {
		System.out.print("Pushing " + n + "... ");
		StackNode newNode = new StackNode(n);
		if (empty()) {
			head = newNode;
			System.out.println("done");
			return;
		}
		newNode.setNext(head);
		head = newNode;
		System.out.println("done");
	}
	
	//Pops element from top of stack.
	//Sets element following head of stack as new head.
	//Empties stack if head is only element in stack.
	//Prints empty message if stack is empty.
	public int pop() {
		if (empty()) {
			System.out.println("Stack is empty");
			return -99999999;
		}
		System.out.print("Popping... ");
		System.out.println("it's a " + head.getValue());
		int result = head.getValue();
		if (head.getNext() == null) {
			head = null;
		} else {
			head = head.getNext();
		}
		return result;
	}
	
	//Returns true if no elements on the stack, false otherwise.
	public boolean empty() {
		if (head == null) {
			return true;
		}
		return false;
	}
}