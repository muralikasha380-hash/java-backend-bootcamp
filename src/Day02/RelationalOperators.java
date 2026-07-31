
package Day02;

import java.util.Scanner;
public class RelationalOperators {


	public static void main(String[] args) {
		
		        int a, b;
		        boolean result;
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the value of a and b: ");
		        a = scanner.nextInt();
		        b = scanner.nextInt();

		        // 1. Equal to
		        result = (a == b);
		        System.out.println("Is a equal to b? " + result);

		        // 2. Not equal to
		        result = (a != b);
		        System.out.println("Is a not equal to b? " + result);

		        // 3. Greater than
		        result = (a > b);
		        System.out.println("Is a greater than b? " + result);

		        // 4. Less than
		        result = (a < b);
		        System.out.println("Is a less than b? " + result);

		        // 5. Greater than or equal to
		        result = (a >= b);
		        System.out.println("Is a greater than or equal to b? " + result);

		        // 6. Less than or equal to
		        result = (a <= b);
		        System.out.println("Is a less than or equal to b? " + result);
		        
		        scanner.close();
	}

}
