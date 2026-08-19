package Day19;

import java.util.LinkedList;
import java.util.Queue;

public class TransactionQueue {

	public static void main(String[] args) {

	Queue<String> transactions = new LinkedList<>();

	transactions.offer("TXN1001 - Deposit");
	transactions.offer("TXN1002 - Withdrawal");
	transactions.offer("TXN1003 - Deposit");
	transactions.offer("TXN1004 - Transfer");

	System.out.println("Transaction Queue:");
	System.out.println(transactions);

	System.out.println("Processing: "
	        + transactions.poll());

	System.out.println("Processing: "
	        + transactions.poll());

	System.out.println("Remaining Transactions:");
	       
	System.out.println(transactions);

	}
}
