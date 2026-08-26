package Day26;

@FunctionalInterface
interface Greeting {
	
	void sayHello();
}
	
	public class FunctionalInterfaceDemo {
		
		public static void main(String[] args) {
			
			Greeting greeting = () ->
			System.out.println("Hello, Java!");
			
			greeting.sayHello();
		}
	}
