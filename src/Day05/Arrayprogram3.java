	//Develop a program to take an array of integers as argument
	//in this method find the sum of all integers available in this array
	//return result

	//in main method call above method by passing int[]
	//this int[] must contain dynamic value reading from the end-user

package Day05;

import java.util.Scanner;

public class Arrayprogram3 {
            
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many values do you want to enter?: ");
        int noOfValues = sc.nextInt();
        
        int[] ia = new int[noOfValues];
        for(int i = 0; i < noOfValues; i++) {
            System.out.print("Enter value " + (i+1) + ": ");
            ia[i] = sc.nextInt();
        }
        
        int result = sumOf(ia);
        System.out.println("Sum of all given values: " + result);
        
        sc.close();
    }
    
    static int sumOf(int[] ia) {
        int sum = 0;
        for(int i = 0; i < ia.length; i++) {
            sum += ia[i];
        }
        return sum;
    }
}
