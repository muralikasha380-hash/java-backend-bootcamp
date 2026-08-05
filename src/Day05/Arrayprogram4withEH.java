//Develop a program to take an array of integers as argument
	//in this method find the sum of all integers available in this array
	//return result

	//in main method call above method by passing int[]
	//this int[] must contain dynamic value reading from the end-user
package Day05;

import java.util.Scanner;

public class Arrayprogram4withEH {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("How many values do you want to enter?: ");
            int noOfValues = sc.nextInt();

            int[] ia = new int[noOfValues];

            for (int i = 0; i < noOfValues; i++) {
                System.out.print("Enter value " + (i + 1) + ": ");
                ia[i] = sc.nextInt();
            }

            int result = sumOf(ia);
            System.out.println("Sum of all given values: " + result);

        } catch (ArrayOperationFailedException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }

    static int sumOf(int[] ia) throws ArrayOperationFailedException {
        if (ia == null) {
            throw new ArrayOperationFailedException("Array cannot be null");
        }

        if (ia.length == 0) {
            throw new ArrayOperationFailedException("Array length cannot be zero");
        }

        int sum = 0;
        for (int i = 0; i < ia.length; i++) {
            sum += ia[i];
        }

        return sum;
    }
}

class ArrayOperationFailedException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ArrayOperationFailedException() {
        super();
    }

    public ArrayOperationFailedException(String errMsg) {
        super(errMsg);
    }
}
