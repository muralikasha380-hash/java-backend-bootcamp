package Day06;

public class Test01_StaticNS {
	static void m1() {
		System.out.println("static m1");
	}

	void m2() {
		System.out.println("non-static m2");
	}

	public static void main(String[] args){
		m1();
		Example.m1();

		//m2();
		//Example.m2();

		Example e1 = new Example();
		e1.m1();
		e1.m2();

		Example e2 = null;
		e2.m1();
		//e2.m2(); //RE: java.lang.NullPointerException
	}
}

