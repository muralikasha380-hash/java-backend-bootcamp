package day01;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String studentName = "Murali Krishna";
	        int studentId = 101;

	        int javaMarks = 90;
	        int pythonMarks = 85;
	        int databaseMarks = 92;

	        int total = javaMarks + pythonMarks + databaseMarks;
	        double percentage = total / 3.0;

	        System.out.println("Student Name : " + studentName);
	        System.out.println("Student ID   : " + studentId);

	        System.out.println("Java     : " + javaMarks);
	        System.out.println("Python   : " + pythonMarks);
	        System.out.println("Database : " + databaseMarks);

	        System.out.println("Total      : " + total);
	        System.out.println("Percentage : " + percentage + "%");

	        if (percentage >= 35) {
	            System.out.println("Result     : PASS");
	        } else {
	            System.out.println("Result     : FAIL");
	        }

	}
	
}
	