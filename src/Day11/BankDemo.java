package Day11;

public class BankDemo {
	
	public static void main(String[] args) {
    	
    	SavingsAccount account = new SavingsAccount();
        
        account.deposit(10000);
        account.calculateInterest();

        System.out.println("Balance: " + account.balance);
        
    }
}
