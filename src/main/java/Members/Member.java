package Members;

import Books.*;

import java.util.ArrayList;

public class Member extends Library {
    private final String name;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Member(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void Borrow(Book book, Library library) {
        if (borrowedBooks.size() < 3) {
            library.getInventory().remove(book);
            borrowedBooks.add(book);
        } else {
            System.out.println(name + " has borrowed a maximum of 3 books!");
        }
    }

    public void Return(Book book, Library library) {
        if (book.getBookOrigin() == library) {
            borrowedBooks.remove(book);
            library.getInventory().add(book);
        } else {
            System.out.println(name + " must return the book to the " + library.toString() + " branch!");
        }
    }
}
