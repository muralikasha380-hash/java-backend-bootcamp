package Day33;

import java.util.Scanner;

public class TransactionApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AccountDAO dao = new AccountDAO();

        System.out.println("===== BANK ACCOUNT TRANSFER =====");

        System.out.print("Enter sender account ID: ");
        int fromAccount = sc.nextInt();

        System.out.print("Enter receiver account ID: ");
        int toAccount = sc.nextInt();

        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Amount must be greater than 0.");
        } else {
            dao.transferMoney(fromAccount, toAccount, amount);
        }

        sc.close();
    }
}