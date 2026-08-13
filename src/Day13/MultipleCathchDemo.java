package Day13;

public class MultipleCathchDemo {

	public static void main(String[] args) {

		try {
			
			int[] numbers = {10, 20, 30};

			int result = 10 / 0;

			System.out.println(numbers[5]);
			
		}
		catch (ArithmeticException e) {

			System.out.println("Arithmetic error");

		}
		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Array index error");
			}
		}
	}

