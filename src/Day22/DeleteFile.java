package Day22;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {

	public static void main(String[] args) {
/*		
		File file1 = new File("xyz.txt");
		boolean deleted = file1.delete();
		System.out.println("xyz.txt is deleted: "+ deleted);
		
		
		File file2 = new File("bbc"); //empty folder
		deleted = file2.delete();
		System.out.println("bbc is deleted    : " + deleted);
		
		File file3 = new File("dbc"); //not empty folder
		deleted = file3.delete();
		System.out.println("dbc is deleted    : "+ deleted);
*/
		
		
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter file/directory to delete: ");
		File file4 = new File(scn.next());
		
		if(file4.exists()) {
			boolean deleted = file4.delete();
			
			if (deleted) {
				System.out.println(file4 + " is deleted");
			}else {
				System.out.println(file4 + " is not deleted");
			}
			
		}else {
			System.out.println(file4+ " does not exist");
		}
	}
	
}

