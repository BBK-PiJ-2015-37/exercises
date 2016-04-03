public class Stack<N extends Number> {
	private StackNode<N> top;
	private int size;
	
	public Stack() {
		this.top = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void push(N itemToPush) {
		StackNode<N> newNode = new StackNode(itemToPush);
		if (top != null) {
			newNode.setNext(top);
		}
		top = newNode;
		size++;
	}
	
	public N pop() {
		N result = null;
		if (size == 1) {
			result = top.getValue();
			top = null;
		} else if (size > 1) {
			result = top.getValue();
			top = top.getNext();
		}
		return result;
	}
}