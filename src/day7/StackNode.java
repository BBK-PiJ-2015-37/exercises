public class StackNode {
	private int n;
	private StackNode next;
	
	public StackNode(int n) {
		this.n = n;
		this.next = null;
	}
	
	public int getValue() {
		return this.n;
	}
	
	public StackNode getNext() {
		return this.next;
	}
	
	public void setNext(StackNode next) {
		this.next = next;
	}
}