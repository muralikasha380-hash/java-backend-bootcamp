package Day06;

	class Student {

	    static String college = "ABC College";

	    String name;

	    Student(String name) {
	        this.name = name;
	    }

	    void display() {
	        System.out.println(name + " studies at " + college);
	    }
	}

	public class StaticVariable {

	    public static void main(String[] args) {

	        Student s1 = new Student("Murali");
	        Student s2 = new Student("Rahul");

	        s1.display();
	        s2.display();

	        Student.college = "XYZ College";

	        System.out.println("\nAfter changing static variable:\n");

	        s1.display();
	        s2.display();

	}

}
