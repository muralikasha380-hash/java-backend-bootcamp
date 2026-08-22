package Day22;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("student.txt");
			
			writer.write("Name: Murali\n");
			writer.write("Course: Java Backend Development\n");
			writer.write("Day: 22");
			
			writer.close();
			
			System.out.println("Successfully wrote to the file.");
			
			} catch (IOException e) {
				System.out.println("An error occurred.");
			}
	}
}