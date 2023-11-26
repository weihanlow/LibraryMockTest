package Books;

public class Book {
    private final String title;
    private final String author;
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
