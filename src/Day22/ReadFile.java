package Day22;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class ReadFile {
	
    public static void main(String[] args) throws IOException {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter file/directory name: ");
        File file = new File(scn.nextLine());
        
        System.out.println("Exists: " + file.exists());
        System.out.println("Is File: " + file.isFile());
        System.out.println("Is Directory: " + file.isDirectory());
        
        System.out.println("Name: " + file.getName());
        System.out.println("Path: " + file.getPath());
        
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Canonical Path: " + file.getCanonicalPath());
        
        System.out.println("Absolute File: " + file.getAbsoluteFile());
        System.out.println("Canonical File: " + file.getCanonicalFile());
        
        System.out.println("Is Absolute: " + file.isAbsolute());
        System.out.println("Is Hidden: " + file.isHidden());

        System.out.println("Can Execute: " + file.canExecute());
        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());

        System.out.println("Last Modified: " + new java.sql.Timestamp(file.lastModified()));
        System.out.println("Length: " + file.length());
        
        String[] list = file.list();
        if(list != null) {
            System.out.println("Contents: " + Arrays.toString(list));
        } else {
            System.out.println("Not a directory or empty.");
        }
        
        boolean deleted = file.delete();
        if(deleted)
            System.out.println(file + " is deleted");
        else
            System.out.println(file + " is not deleted");
        
        scn.close();
    }
}
