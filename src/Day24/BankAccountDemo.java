package Day24;

	class BankAccount {
		
		private int balance = 10000;
		
		public synchronized void deposit(int amount) {
			
			balance += amount;
			
			System.out.println(
					Thread.currentThread().getName()
					+ " deposited: " + amount);
			
			System.out.println("Current Balance: " + balance);
		}
		
		public synchronized void withdraw(int amount) {
			
			if (balance >= amount) {
				
				balance -= amount;
				
				System.out.println(
						Thread.currentThread().getName()
						+ " withdrew: " + amount);
				
				System.out.println("Current Balance: " + balance);
				
			} else {
				
				System.out.println("Insufficient balance");
			}
		}
		
		public int getBalance() {
			return balance;
		}
	}

	public class BankAccountDemo {
		
		public static void main(String[] args)
				throws InterruptedException {
			
			BankAccount account = new BankAccount();
			
			Thread depositThread = new Thread(() -> {
				account.deposit(5000);
			}, "Deposit Thread");
			
			Thread withdrawalThread = new Thread(() -> {
				account.withdraw(3000);
			}, "Withdrawal Thread");
			
			depositThread.start();
			withdrawalThread.start();
			
			depositThread.join();
			withdrawalThread.join();
			
			System.out.println(
					"Final Balance: " + account.getBalance());
		}
	}