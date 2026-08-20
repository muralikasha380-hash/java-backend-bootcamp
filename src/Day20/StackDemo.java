package Day20;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> books = new Stack<>();

		// Adding elements
		books.push("Java");
		books.push("Spring Boot");
		books.push("MySQL");
		books.push("Git");

		System.out.println("Stack: " + books);

		// View top element
		System.out.println("Top book: " + books.peek());

		// Remove top element
		System.out.println("Removed: " + books.pop());

		System.out.println("Final Stack: " + books);

		System.out.println("Stack Size: " + books.size());
	}
}
