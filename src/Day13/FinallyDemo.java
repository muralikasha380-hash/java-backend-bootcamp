package Day13;

public class FinallyDemo {

	public static void main(String[] args) {

		try {

			int result = 10 / 2;
			System.out.println(result);

			}
			catch (ArithmeticException e) {
				
			System.out.println("Arithmetic error");

			}
			finally {

				System.out.println("Finally block executed");
	        }
	    }
	}

