package Day11;

abstract class BankAccount {
	
	double balance;
	
	void deposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Amount deposited: " + amount);
		
	}

    abstract void calculateInterest();
}
