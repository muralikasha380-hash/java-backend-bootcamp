package Day06;

	import java.util.Scanner;

	public class Calculator {

	    static int add(int a, int b) {
	        return a + b;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        System.out.println("Sum = " + add(a, b));

	        sc.close();
	}

}
