package Day46;

public class LibraryApp {

    public static void main(String[] args) {

        System.out.println("===== LIBRARY BOOK MANAGEMENT =====");

        LibraryFilteredRowSetDAO dao = new LibraryFilteredRowSetDAO();

        dao.viewAffordableBooks();
    }
}