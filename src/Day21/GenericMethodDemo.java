package Day21;

public class GenericMethodDemo {

	public static <T> void printData(T data) {

		System.out.println(data);
	}

	public static void main(String[] args) {

		printData("Murali");

		printData(100);

		printData(50.5);
	}
}
