package Day15;

import java.util.LinkedList;

public class TransactionHistory {

	public static void main(String[] args) {

		LinkedList<String> transactions = new LinkedList<>();

		transactions.add("Deposit: 5000");
		transactions.add("Withdrawal: 1000");
		transactions.add("Deposit: 3000");
		transactions.add("Withdrawal: 500");

		System.out.println("Transaction History:");

		for (String transaction : transactions) {
			System.out.println(transaction);
		}

		System.out.println("Total Transactions: "
				+ transactions.size());

	}
}
