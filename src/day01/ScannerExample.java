package day01;

import java.util.Scanner;

public class ScannerExample {
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);


	        System.out.print("Enter Student Name : ");
	        String name = sc.nextLine();

	        System.out.print("Enter Student Age : ");
	        int age = sc.nextInt();

	        System.out.print("Enter Student Marks : ");
	        double marks = sc.nextDouble();

	        System.out.print("Enter Student Grade : ");
	        char grade = sc.next().charAt(0);

	     // Pass or Fail
	        if (marks >= 27) {
	            System.out.println("Result : PASS");
	        } else {
	            System.out.println("Result : FAIL");
	        }

	        sc.close();
	    }
	}

