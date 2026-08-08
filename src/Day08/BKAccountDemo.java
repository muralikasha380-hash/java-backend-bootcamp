package Day08;

class BKAccount {   
    
    private long accountNumber;
    private String holderName;
    private double balance;
    
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BKAccountDemo {

    public static void main(String[] args) {

        BKAccount account = new BKAccount();  

        account.setAccountNumber(1001);
        account.setHolderName("Murali");
        account.setBalance(50000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Holder Name: " + account.getHolderName());
        System.out.println("Balance: " + account.getBalance());
    }
}


