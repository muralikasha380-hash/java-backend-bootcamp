package Day17;

import java.util.HashMap;

public class AccountMap {

	public static void main(String[] args) {

		HashMap<Long, String> accounts = new HashMap<>();

		accounts.put(1001L, "Murali");
		accounts.put(1002L, "Krishna");
		accounts.put(1003L, "Ravi");

		System.out.println("Accounts: " + accounts);

		// Find account holder
		System.out.println("Account 1001 belongs to: "
				+ accounts.get(1001L));

		// Check account
		System.out.println("Account 1002 exists: "
				+ accounts.containsKey(1002L));

		// Remove account
		accounts.remove(1003L);

		System.out.println("Final Accounts: " + accounts);
	}
}
