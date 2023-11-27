package Library;

import java.time.LocalDate;
import Members.*;

public interface BorrowSystem {
    LocalDate currentdate = LocalDate.now();

    default void getReturnDate(Member member) {
        int BorrowTime = 15;
        System.out.println("Please return this Item by " + currentdate.plusDays(BorrowTime));
    }
}
