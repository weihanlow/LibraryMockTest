import Members.*;
import Library.*;

public class Main {
    public static void main(String[] args) {
        Inventories lib = new Inventories();
        LibSystem borrowSystem = new LibSystem();
        Faculty JS = new Faculty("John Smith");
        Student JD = new Student("Jane Dirkson");

        JS.Borrow(lib.AD001, lib.Central);
        JS.Borrow(lib.AD002, lib.Westside);
        JD.Borrow(lib.GR001, lib.Central);
        JD.Borrow(lib.GR002, lib.Central);
        JD.Borrow(lib.GR003, lib.Central);
        JD.Borrow(lib.GR004, lib.Central);
        JD.Borrow(lib.AD003, lib.Central);

        borrowSystem.getReturnDate(JS);
        borrowSystem.getReturnDate(JD);

        JS.Return(lib.AD001, lib.Central);
        JS.Return(lib.AD002, lib.Central);

    }
}