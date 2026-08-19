package Day19;

import java.util.LinkedList;
import java.util.Queue;

public class customerQueue {
	public static void main(String[] args) {
	        
		// Create a Queue of Strings
		Queue<String> queue = new LinkedList<>();
	        
		// Add 5 customers
		queue.add("Customer1");
		queue.add("Customer2");
		queue.add("Customer3");
		queue.add("Customer4");
		queue.add("Customer5");
	        
		// Display the queue
		System.out.println("Initial Queue: " + queue);
	        
		// Display the first customer using peek()
		System.out.println("First Customer (peek): " + queue.peek());
	        
		// Remove two customers using poll()
		System.out.println("Removed: " + queue.poll());
		System.out.println("Removed: " + queue.poll());
	        
		// Display the final queue
		System.out.println("Final Queue: " + queue);
	        
		// Display the queue size
		System.out.println("Queue Size: " + queue.size());
	    
	}
}
