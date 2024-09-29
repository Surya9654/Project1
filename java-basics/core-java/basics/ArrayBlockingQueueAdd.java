package basics;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueAdd {

	public static void main(String[] args) {
		// define capacity of ArrayBlockingQueue
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the Qeue Size ");
		int entry = sc.nextInt();
		int capacity = entry;

		try {
			// Create object of ArrayBlockingQueue
			ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(capacity);

			// Add element to ArrayBlockingQueue
			queue.add(766);
			queue.add(432);
			queue.add(456);
			queue.add(489);
			System.out.println("Added elements are: " + queue);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
