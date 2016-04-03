public class DoublyLinkedListNode<T> {
	private T value;
	private DoublyLinkedListNode<T> next;
	private DoublyLinkedListNode<T> prev;
	
	public DoublyLinkedListNode(T value) {
		this.value = value;
		next = null;
		prev = null;
	}
	
	public T getValue() {
		return value;
	}
	
	public void setNext(DoublyLinkedListNode<T> next) {
		this.next = next;
	}
	
	public DoublyLinkedListNode<T> getNext() {
		return next;
	}
	
	public void setPrev(DoublyLinkedListNode<T> prev) {
		this.prev = prev;
	}
	
	public DoublyLinkedListNode<T> getPrev() {
		return prev;
	}
}