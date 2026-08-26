package Day26;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TransactionFilter {

	public static void main(String[] args) {
		
		List<Integer> transactions = new ArrayList<>();
		
		transactions.add(500);
		transactions.add(1500);
		transactions.add(3000);
		transactions.add(750);
		transactions.add(5000);
		
		Predicate<Integer> highValueTransaction =
				amount -> amount >= 1000;
				
				System.out.println("High Value Transactions:");
				
				for (Integer amount : transactions) {
					
					if (highValueTransaction.test(amount)) {
						
						System.out.println("₹" + amount);
					}
				}
	}
}