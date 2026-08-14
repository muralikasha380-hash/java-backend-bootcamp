package Day14;

import java.util.ArrayList;

public class TransactionList {

	public static void main(String[] args) {

	    	ArrayList<Double> transactions = new ArrayList<>();

	        transactions.add(5000.0);
	        transactions.add(-1000.0);
	        transactions.add(2500.0);
	        transactions.add(-500.0);

	        System.out.println("Transactions:");

	        for (Double transaction : transactions) {
	        	System.out.println(transaction);
	        }

	        System.out.println("Total transactions: "
	        		+ transactions.size());
	}
}
