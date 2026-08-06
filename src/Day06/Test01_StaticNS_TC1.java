package Day06;

  class Example {
	static int a = 10;
	int x = 20;

	static void m1() { //executed for current class common to all objects
	   a = 15;
	}

	void m2(){  //is executed from current object specific to this object
	   x = 16;	//current object means the object using which we invoke this method
	}
}
class Test01_StaticNS_TC {
	
	public static void main(String[] args) {
		Example e1 = new Example();
		Example e2 = new Example();

		System.out.println(e1.a + " " + e2.a);
		e1.m1();	//for both object the variable a value is 15
		System.out.println(e1.a + " " + e2.a);

		System.out.println(e1.x + " " + e2.x);
		e1.m2();	//only e1 object's x value will be 16
		System.out.println(e1.x + " " + e2.x);
	
		e2.m2();	//now e2 object's x value is also will be 16
		System.out.println(e1.x + " " + e2.x);
	}
}

