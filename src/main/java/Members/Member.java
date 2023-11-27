package Members;

import Books.*;
import Library.*;
import java.util.ArrayList;

public class Member extends Library {
    private final String name;
    private final ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Member(String name) {
        super(name);
        this.name = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void Borrow(Book book, Library library) {
        if (book.getBookOrigin() == library) {
            if (borrowedBooks.size() < 3) {
                library.getInventory().remove(book);
                borrowedBooks.add(book);
            } else {
                System.out.println(name + " has borrowed a maximum of 3 books!");
            }
        } else {
            System.out.println(book.title + " not found in the " + library.name + " branch!");
        }
    }

    public void Return(Book book, Library library) {
        if (book.getBookOrigin() == library) {
            borrowedBooks.remove(book);
            library.getInventory().add(book);
        } else {
            System.out.println(name + " must return " + book.title +" to the " + library.name + " branch!");
        }
    }
}
