public class StackNode<N extends Number> {
	private N value;
	private StackNode next;
	
	public StackNode(N value) {
		this.value = value;
		this.next = null;
	}
	
	public N getValue() {
		return value;
	}
	
	public StackNode getNext() {
		return next;
	}
	
	public void setNext(StackNode next) {
		this.next = next;
	}
}