package Day26;

import java.util.function.Consumer;

public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		Consumer<String> display =
				name -> System.out.println(
						"Hello " + name);
				
				display.accept("Murali");
	}
}
