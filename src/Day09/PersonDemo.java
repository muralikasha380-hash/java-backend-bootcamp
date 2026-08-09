package Day09;

class Person {

	String name = "Person";

	void display() {
	    System.out.println("Parent display");
	}
}

class Student extends Person {

	String name = "Student";

	void show() {

	    System.out.println(name);
	    System.out.println(super.name);

	    display();
	    super.display();
	}
}

public class PersonDemo {

	public static void main(String[] args) {

	    Student s1 = new Student();

	    s1.show();
	}
}

