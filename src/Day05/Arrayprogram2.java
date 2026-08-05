package Day05;

	import java.util.Scanner;

	//Develop a program to read integers from a keyboard
	//read as many values as user is passing
	//read those values and store all those values in the program

	public class Arrayprogram2 {
		
		public static void main(String[] args) {
			
			Scanner scn = new Scanner(System.in);
			
			System.out.print("How many values do you want to enter?: ");
			int noOfValues = scn.nextInt();

		//1. creating array object with dynamic size
			int[] ia = new int[noOfValues];
			System.out.println("array object is created with " + noOfValues + " location(s)");

		//2. initializing array object with dynamic values 	
			for(int i=0; i<noOfValues; i++) {
				System.out.print("Enter value"+(i+1)+": ");
				ia[i] = scn.nextInt();
			}

		//3. printing array object values with dynamic code	
			System.out.println("You entered values are");
			for(int i=0; i<noOfValues; i++) {
				System.out.println(ia[i]);
					
		}
	}

}
