package Day18;

import java.util.TreeMap;

public class AccountMap {

	public static void main(String[] args) {

		TreeMap<Long, String> accounts = new TreeMap<>();

		accounts.put(1005L, "Murali");
		accounts.put(1001L, "Krishna");
		accounts.put(1003L, "Ravi");
		accounts.put(1002L, "Vardhan");
		accounts.put(1004L, "Yash");

		System.out.println("Accounts: " + accounts);

		System.out.println("Account 1003: "
				+ accounts.get(1003L));

		//removing an element
		accounts.remove(1005L);
		
		//final
		System.out.println("Final Accounts: " + accounts);
		
		//total
		System.out.println("Total Accounts: "
	                + accounts.size());
	}
}
