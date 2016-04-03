public class Increaser implements Runnable {
	private Counter c;
	
	public Increaser(Counter counter) {
		this.c = counter;
	}
	
	/*
	 * main() now increments c's n variable to 100,000
	 */
	public static void main(String args[]) {
		Counter counter = new Counter();
		Increaser increaserTask = new Increaser(counter);	//moved outside loop, leading to only one instance of Increaser
		for (int i = 0; i < 100; i++) {	
			Thread t = new Thread(increaserTask);
			t.start();
		}
	}
	
	/*
	 * Synchronized run() method so that current thread must
	 * complete it before next thread can start.
	 */
	public synchronized void run() {
		System.out.println("Starting at " + c.getCount());
		for (int i = 0; i < 1000; i++) {
			c.increase();
		}
		System.out.println("Stopping at " + c.getCount());
	}
}