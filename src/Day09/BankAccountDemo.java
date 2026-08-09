package Day09;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(5000);
        
        System.out.println("Balance: " + account.balance);
    }
}