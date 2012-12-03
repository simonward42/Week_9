public class Counter {
	private int n = 0;
	public synchronized void increase() { // synchronize this method ...
		n++;
	}
	public int getCount() { // ... and this one doesn't need to be, we only really care about the final amount,
		return n;			// and though the threads are running unpredictably, they are individually predictable.
	}
}