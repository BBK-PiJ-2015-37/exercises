public class Responsive {
	private String completedList;
	
	public void requestTask(int taskId) {
		System.out.print("Enter the duration (in ms) of task " + taskId + ": ");
		int taskDuration = Integer.parseInt(System.console().readLine());
		Runnable taskRun = new RunnableWait(taskId, taskDuration);
		Thread newRun = new Thread(taskRun);
		newRun.start();
		getCompletedTasks();
	}
	
	public synchronized void getCompletedTasks() {
		if (completedList.length() > 0) {
			System.out.println("Finished tasks: " + completedList);
			completedList = "";
		}
	}
	
	public void launch() {
		completedList = "";
		for (int i = 0; i < 10; i ++) {
			requestTask(i);
		}
	}
	
	public static void main(String[] args) {
		Responsive r = new Responsive();
		r.launch();
	}
	
	class RunnableWait implements Runnable {
		private int id;
		private int duration;
		
		public RunnableWait(int id, int duration) {
			this.id = id;
			this.duration = duration;
		}
		
		public void run() {
			try {
				Thread.sleep(duration);
				if (completedList.length() > 0) {
					completedList += ",";
				}
				completedList += Integer.toString(id);
			} catch (InterruptedException ex) {
				//no means of throwing this exception, so not dealt with.
			}
		}
	}
}