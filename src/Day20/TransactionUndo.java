package Day20;

import java.util.Stack;

public class TransactionUndo {

	public static void main(String[] args) {

		Stack<String> transactions = new Stack<>();

		transactions.push("Deposit ₹5000");
		transactions.push("Withdraw ₹1000");
		transactions.push("Transfer ₹2000");

		System.out.println("Transactions: " + transactions);

		// Undo the last transaction
		String undoneTransaction = transactions.pop();

		System.out.println("Undone Transaction: "
				+ undoneTransaction);

		System.out.println("Remaining Transactions: "
				+ transactions);

		System.out.println("Total Transactions: "
				+ transactions.size());

	}
}
