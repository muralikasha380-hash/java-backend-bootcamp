package Day16;

import java.util.HashSet;

public class TransactionIds {

	public static void main(String[] args) {

	    HashSet<String> transactionIds = new HashSet<>();

	    transactionIds.add("TXN1001");
	    transactionIds.add("TXN1002");
	    transactionIds.add("TXN1003");
	    transactionIds.add("TXN1001");

	    System.out.println("Transaction IDs:");

	    for (String id : transactionIds) {
	        System.out.println(id);
	    }

	    System.out.println("Unique transactions: "
	            + transactionIds.size());
	}
}

