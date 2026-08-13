package Day13;

public class ThrowDemo {

	public static void main(String[] args) {

		int age = 15;

		try {
			
			if (age < 18) {
				throw new IllegalArgumentException(
						"Age must be 18 or above"
						);
				}
			
			System.out.println("Eligible");
			
		} catch (IllegalArgumentException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Program continues...");
		}
}
