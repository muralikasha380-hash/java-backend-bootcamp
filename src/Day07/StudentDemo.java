package Day07;

class Student {

	     String name;
	     int rollNo;
	     int marks;

	     void display() {
	         System.out.println("Name: " + name);
	         System.out.println("Roll No: " + rollNo);
	         System.out.println("Marks: " + marks);
	     }
	 }

public class StudentDemo {
	
	public static void main(String[] args) {

	     Student s1 = new Student();

	     s1.name = "Murali";
	     s1.rollNo = 101;
	     s1.marks = 85;

	       s1.display();
	       
	     }
	 }
