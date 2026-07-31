package Day02;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the values of a, b and c: ");

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        // AND Operator
        if (a > b && a > c) {
            System.out.println("AND Operator: a is greater than both b and c.");
        } else {
            System.out.println("AND Operator: Condition is false.");
        }

        // OR Operator
        if (a > b || a > c) {
            System.out.println("OR Operator: At least one condition is true.");
        } else {
            System.out.println("OR Operator: Both conditions are false.");
        }

        // NOT Operator
        if (!(a > c)) {
            System.out.println("NOT Operator: a is NOT greater than c.");
        } else {
            System.out.println("NOT Operator: a is greater than c.");
        }

        scanner.close();
    }
}