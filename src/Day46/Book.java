package Day46;

public class Book {

    private int bookId;
    private String bookName;
    private String author;
    private String category;
    private double price;

    public Book(int bookId, String bookName, String author, String category, double price)
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.category = category;
        this.price = price;
    }
    public int getBookId() {
        return bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return author;
    }
    public String getCategory() {
        return category;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Name: " + bookName + ", Author: " + author + ", Category: " + category + ", Price: " + price;
    }
}