package basics;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueuePut {

	public static void main(String[] args) {
		// define capacity of ArrayBlockingQueue
		int capacity = 3;

		try {
			// Create object of ArrayBlockingQueue
			ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(capacity);

			// Add elements to ArrayBlockingQueue
			queue.put(
					"4");
			queue.put(
					"2");
			queue.put(
					"3");
			queue.put(
					"5");

			System.out.println("Queue contains: " + queue);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
