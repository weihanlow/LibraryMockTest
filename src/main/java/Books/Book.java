package Books;
import Library.*;
public class Book {
    public final String title;
    public final String author;
    private final Library bookOrigin;

    public Book(String title, String author, Library bookOrigin) {
        this.title = title;
        this.author = author;
        this.bookOrigin = bookOrigin;
    }

    public Library getBookOrigin() {
        return bookOrigin;
    }
}
