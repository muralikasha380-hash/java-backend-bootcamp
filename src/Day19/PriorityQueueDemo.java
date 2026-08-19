package Day19;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> numbers = new PriorityQueue<>();

		numbers.offer(50);
		numbers.offer(10);
		numbers.offer(30);
		numbers.offer(20);

		System.out.println("Priority Queue: " + numbers);

		System.out.println("First: " + numbers.peek());

		System.out.println("Removed: " + numbers.poll());

		System.out.println("After removal: " + numbers);
		
	}
}
