public class QueueNode {
	private int n;
	private QueueNode next;
	
	public QueueNode(int n) {
		this.n = n;
		this.next = null;
	}
	
	public int getValue() {
		return this.n;
	}
	
	public QueueNode getNext() {
		return this.next;
	}
	
	public void setNext(QueueNode next) {
		this.next = next;
	}
}