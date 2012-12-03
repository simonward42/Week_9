public class Sleeper implements Runnable {
	private int time;
	private int taskNumber;
	private String finished = "";
	public Sleeper(int taskNumber, int time) {
		this.taskNumber = taskNumber;
		this.time = time;
	}
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print("Enter the duration (in ms) of task " + i + ": ");
			int time = Integer.parseInt(System.console().readLine());
			Runnable s = new Sleeper(i, time);
			Thread t = new Thread(s);
			t.start();
			s.printFinishedTasks();
		}
	}
	public void run() {
		try {
			Thread.sleep(time);
		} catch (InterruptedException ex) {
			// Nothing to do ... ?
		}
		synchronized(finished) {
			if(finished.isEmpty) {
				finished += taskNumber;
			} else {
				finished += ", " + taskNumber;
			}
		}
	}
	public void printFinishedTasks() {
		if(!finished.isEmpty()) {
			System.out.println("Finished tasks: " + finished);
		}
	}
}