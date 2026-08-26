package Day26;
	
import java.util.function.Predicate;
	
public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isEven =
				number -> number % 2 == 0;
				
				System.out.println(isEven.test(10));
				System.out.println(isEven.test(7));
	}
}
