package Day06;

public class StaticMethod {

	    static void greet() {
	        System.out.println("Welcome to Java Backend!");
	    }

	    public static void main(String[] args) {

	        greet();

	        StaticMethod.greet();
	}

}
