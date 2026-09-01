package Day32;

import java.util.Scanner;

public class patientApp {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        patientDAO dao = new patientDAO();

        while (true) {

            System.out.println();
            System.out.println("===== Patient Management System =====");

            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Retrieve Patient");
            System.out.println("4. Update Patient");
            System.out.println("5. Delete Patient");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = scn.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Patient ID: ");
                int id = scn.nextInt();

                scn.nextLine();

                System.out.print("Enter Patient Name: ");
                String name = scn.nextLine();

                System.out.print("Enter Patient Age: ");
                int age = scn.nextInt();

                scn.nextLine();

                System.out.print("Enter Disease: ");
                String disease = scn.nextLine();

                patient p = new patient(id, name, age, disease);

                dao.addPatient(p);

                break;

            case 2:

                dao.viewPatients();

                break;

            case 3:

                System.out.print("Enter Patient ID: ");
                int searchId = scn.nextInt();

                dao.retrievePatient(searchId);

                break;

            case 4:

                System.out.print("Enter Patient ID: ");
                int updateId = scn.nextInt();

                scn.nextLine();

                System.out.print("Enter New Disease: ");
                String newDisease = scn.nextLine();

                dao.updatePatient(updateId, newDisease);

                break;

            case 5:

                System.out.print("Enter Patient ID: ");
                int deleteId = scn.nextInt();

                dao.deletePatient(deleteId);

                break;

            case 6:

                System.out.println(
                        "Thank you for using Patient Management System!");

                scn.close();

                return;

            default:

                System.out.println("Invalid choice!");

            }
        }
    }
}