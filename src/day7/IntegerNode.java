public class IntegerNode {
	private int n;
	private IntegerNode next;
	
	public IntegerNode(int n) {
		this.n = n;
		this.next = null;
	}
	
	public int getNumber() {
		return this.n;
	}
	
	public IntegerNode getNext() {
		return this.next;
	}
	
	public void setNext(IntegerNode nextInteger) {
		this.next = nextInteger;
	}
}