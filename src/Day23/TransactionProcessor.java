package Day23;

	class DepositTask extends Thread {

		@Override
		public void run() {

			for (int i = 1; i <= 3; i++) {
				System.out.println("Processing Deposit: " + i);
	            
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("Deposit task interrupted");
				}
			}
		}
	}

	class WithdrawalTask extends Thread {
		
		@Override
		public void run() {
	    	
			for (int i = 1; i <= 3; i++) {
				System.out.println("Processing Withdrawal: " + i);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					System.out.println("Withdrawal task interrupted");
				}
			}
		}
	}

	public class TransactionProcessor {
		
		public static void main(String[] args) {
			
			DepositTask deposit = new DepositTask();
			WithdrawalTask withdrawal = new WithdrawalTask();
			
			deposit.start();
			withdrawal.start();
		}
	}
