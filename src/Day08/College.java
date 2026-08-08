package Day08;

public class College {
	

	public static void main(String[] args) {

		Student s1 = new Student();
		System.out.println("s1 object is created");
		s1.display();

		s1.setSno(101);
		s1.setSname("Mk");
		
		System.out.println("\ns1 object values");
		System.out.println("  sno\t\t: "	+ s1.getSno());
		System.out.println("  sname\t\t: "	+ s1.getSname());
	
  }

}

	
