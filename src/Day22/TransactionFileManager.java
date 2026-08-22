package Day22;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TransactionFileManager {

	public static void main(String[] args) {
		
		try {
			File file = new File("transactions.txt");

			if (file.createNewFile()) {
				System.out.println("Transaction file created.");
			}
			
			FileWriter writer = new FileWriter(file);
			
			writer.write("TXN1001 - Deposit - 5000\n");
			writer.write("TXN1002 - Withdrawal - 1000\n");
			writer.write("TXN1003 - Transfer - 2000\n");
			
			writer.close();
			
			System.out.println("\nTransaction History:");
			
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			
			scanner.close();
			
		} catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }
	}
