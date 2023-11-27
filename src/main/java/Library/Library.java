package Library;

import java.util.ArrayList;
import Books.*;
public class Library {
    private final ArrayList<Book> Inventory = new ArrayList<>();
    public final String name;

    public Library(String name) {
        this.name = name;
    }

    public ArrayList<Book> getInventory() {
        return Inventory;
    }
}
