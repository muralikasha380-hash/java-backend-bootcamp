package Day44;

public class PatientApp {

    public static void main(String[] args) {

        System.out.println("===== WEB ROWSET PATIENT APPLICATION =====");

        PatientWebRowSetDAO dao =new PatientWebRowSetDAO();
        dao.viewPatients();
    }
}