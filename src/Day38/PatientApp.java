package Day38;

import java.util.Scanner;

public class PatientApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientDAO dao = new PatientDAO();

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("     PATIENT MANAGEMENT SYSTEM");
            System.out.println("================================");

            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Update Patient");
            System.out.println("5. Delete Patient");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Patient ID: ");
                String pid = sc.next();

                System.out.print("Enter Patient Name: ");
                String pname = sc.next();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                System.out.print("Enter Contact: ");
                long contact = sc.nextLong();

                Patient patient = new Patient(pid, pname, age, contact);

                dao.addPatient(patient);

                break;


            case 2:

                dao.viewPatients();

                break;


            case 3:

                System.out.print("Enter Patient ID to search: ");
                String searchPid = sc.next();

                dao.searchPatient(searchPid);

                break;


            case 4:

                System.out.print("Enter Patient ID to update: ");
                String updatePid = sc.next();

                System.out.print("Enter New Name: ");
                String updateName = sc.next();

                System.out.print("Enter New Age: ");
                int updateAge = sc.nextInt();

                System.out.print("Enter New Contact: ");
                long updateContact = sc.nextLong();

                dao.updatePatient(updatePid, updateName,updateAge, updateContact);

                break;


            case 5:

                System.out.print("Enter Patient ID to delete: ");
                String deletePid = sc.next();

                dao.deletePatient(deletePid);

                break;


            case 6:

                System.out.println("Thank you!");
                break;


            default:

                System.out.println("Invalid choice!");

            }

        } while (choice != 6);

        sc.close();
    }
}