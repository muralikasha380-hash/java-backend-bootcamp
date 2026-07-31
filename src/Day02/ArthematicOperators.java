package Day02;

import java.util.Scanner;

public class ArthematicOperators {

	public static void main(String[] args) {
		      
		int a, b, result;
		        
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the value of a and b: ");
		        
		        //take two values from user
		        a = scanner.nextInt();
		        b = scanner.nextInt();
		        
		        result = a + b; //arithmetic addition of a and b
		        System.out.println("Result after addition: " + result);
		        
		        result = a - b; //arithmetic subtraction of a and b
		        System.out.println("Result after subtraction: " + result);
		        
		        result = a * b; //arithmetic multiplication of a and b
		        System.out.println("Result after multiplication: " + result);
		        
		        result = a / b; //arithmetic division of a and b
		        System.out.println("Result after division: " + result);
		        
		        result = a % b;
		        System.out.println("Result after modules: " + result);
		
		        scanner.close();
		        
		     
		    /*
		        int a = 20;
		       
		        int b = 10;

		        System.out.println("Addition = " + (a + b));
		     
		        System.out.println("Subtraction = " + (a - b));
		     
		        System.out.println("Multiplication = " + (a * b));
		        
		        System.out.println("Division = " + (a / b));
		        
		        System.out.println("Modulus = " + (a % b));
		   */
	
	}

}
