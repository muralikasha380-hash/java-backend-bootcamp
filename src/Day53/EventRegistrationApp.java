package Day53;

import java.util.Scanner;

public class EventRegistrationApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EventRegistrationDAO dao =
                new EventRegistrationDAO();

        System.out.println(
                "===== EVENT REGISTRATION MANAGEMENT ====="
        );

        System.out.print("Enter Registration ID: ");
        int regId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Participant Name: ");
        String participantName = sc.nextLine();

        System.out.print("Enter Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Number of Tickets: ");
        int ticketCount = sc.nextInt();

        dao.registerEvent(
                regId,
                participantName,
                eventName,
                email,
                ticketCount
        );

        System.out.println();
        dao.viewRegistrations();

        sc.close();
    }
}