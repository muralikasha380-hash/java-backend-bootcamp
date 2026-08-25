package Day25;
	
class BankAccount {
	
	private int balance = 0;
	private boolean transactionCompleted = false;
	
	public synchronized void deposit(int amount) {
		
		System.out.println("Depositing: " + amount);	
		
		balance += amount;
		transactionCompleted = true;
		
		System.out.println("Deposit completed.");
		
		notify();
	}
	
	public synchronized void checkBalance() {
		
		while (!transactionCompleted) {
			
			try {
				
				System.out.println(
						"Waiting for transaction...");
				
				wait();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println(
				"Current Balance: " + balance);
	}
}	
	
public class BankTransaction {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		Thread balanceThread = new Thread(() -> {
			account.checkBalance();
		});
		
		Thread depositThread = new Thread(() -> {
			account.deposit(5000);
		});
		
		balanceThread.start();
		depositThread.start();
	}
}