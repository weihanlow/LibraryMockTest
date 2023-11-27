package Library;

import Books.*;
import Members.*;

public class LibSystem implements BorrowSystem{

    @Override
    public void getReturnDate(Member member) {
        if (member.getClass() == Student.class) {
            int i;
            for (i = 0; i < member.getBorrowedBooks().size(); i++) {
                Book selectedBook = member.getBorrowedBooks().get(i);
                if (selectedBook.getClass() == Fiction.class) {
                    System.out.println("Please return " + selectedBook.title + " by " + currentdate.plusDays(15));
                } else if (selectedBook.getClass() == NonFiction.class) {
                    System.out.println("Please return " + selectedBook.title + " by " + currentdate.plusDays(10));
                }
            }
        } else if (member.getClass() == Faculty.class) {
            int i;
            for (i = 0; i < member.getBorrowedBooks().size(); i++) {
                Book selectedBook = member.getBorrowedBooks().get(i);
                if (selectedBook.getClass() == Fiction.class) {
                    System.out.println("Please return " + selectedBook.title + " by " + currentdate.plusDays(30));
                } else if (selectedBook.getClass() == NonFiction.class) {
                    System.out.println("Please return " + selectedBook.title + " by " + currentdate.plusDays(20));
                }
            }
        }
        System.out.println(" ");
    }
}
