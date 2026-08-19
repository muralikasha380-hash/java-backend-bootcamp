package Day19;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

	    Queue<String> students = new LinkedList<>();

	    students.offer("Murali");
	    students.offer("Krishna");
	    students.offer("Ravi");
	    students.offer("Yash");
	    
	    //peek() Looks at the first element without removing it
	    System.out.println("First student: " + students.peek());
	    
	    //poll() Removes and returns the first element.
	    System.out.println("Removed: " + students.poll());

	    System.out.println("Queue: " + students);
	}
}
