package Day20;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {

		Deque<String> students = new ArrayDeque<>();

		students.addFirst("Murali");
		students.addLast("Krishna");
		students.addFirst("Ravi");
		students.addLast("Yash");

		System.out.println("Deque: " + students);

		System.out.println("First: " + students.peekFirst());
		System.out.println("Last: " + students.peekLast());

		students.removeFirst();
		students.removeLast();

		System.out.println("Final Deque: " + students);
	}
}
