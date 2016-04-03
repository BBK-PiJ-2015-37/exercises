public class Queue {
	private QueueNode head;
	
	public void launch() {
		printSize();
		insert(5);
		insert(8);
		insert(12);
		printSize();
		retrieve();
		insert(13);
		printSize();
		retrieve();
		retrieve();
		printSize();
		retrieve();
		retrieve();
	}
	
	public Queue() {
		head = null;
	}
	
	//Inserts request at end of queue.
	//Sets element as queue head if queue empty.
	public void insert(int n) {
		System.out.print("Inserting request " + n + "...");
		QueueNode node = new QueueNode(n);
		if (head == null) {
			head = node;
			System.out.println("done");
			return;
		}
		node.setNext(head);
		head = node;
		System.out.println("done");
	}
	
	//Retrieves request from head of queue.
	//If queue is empty, prints corresponding message.
	public void retrieve() {
		if (size() == 0) {
			System.out.println("Queue empty.");
			return;
		}
		QueueNode current = head;
		if (current.getNext() == null) {
			System.out.print("Retrieving request " + current.getValue() + "... " );
			head = null;
			System.out.println("done");
			return;
		}
		while (current.getNext().getNext() != null) {
			current = current.getNext();
		}
		System.out.print("Retrieving request " + current.getNext().getValue() + "... " );
		current.setNext(null);
		System.out.println("done");
	}
	
	//Calculates number of requests in queue.
	public int size() {
		if (head == null) {
			return 0;
		}
		QueueNode current = head;
		int count = 1;
		while (current.getNext() != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}
	
	//Prints number of requests in queue.
	public void printSize() {
		System.out.println("Number of requests in queue: " + size());
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.launch();
	}
}