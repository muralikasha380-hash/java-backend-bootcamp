package Day26;

interface Calculator {
	
	int calculate(int a, int b);
}

public class LambdaDemo {
	
	public static void main(String[] args) {
		
		Calculator addition = (a, b) -> a + b;
		
		Calculator multiplication = (a, b) -> a * b;
		
		System.out.println(
				"Addition: " + addition.calculate(10, 20));
		
		System.out.println(
				"Multiplication: "
						+ multiplication.calculate(10, 20));
	}
}

