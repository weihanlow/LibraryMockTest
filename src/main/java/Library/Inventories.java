package Library;

import Books.*;

public class Inventories {

    public final Library Central = new Library("Central");
    public final Library Westside = new Library("Westside");
    public final Fiction AD003 = new Fiction("Mummy book", "Adam Davis", Central);
    public final NonFiction GR002 = new NonFiction("Lizard book", "Georgia Riles", Central);
    public final NonFiction GR003 = new NonFiction("Frog book", "Georgia Riles", Central);
    public final NonFiction GR004 = new NonFiction("Worm book", "Georgia Riles", Central);
    public final Fiction AD001 = new Fiction("Werewolf book", "Adam Davis", Westside);
    public final Fiction AD002 = new Fiction("Vampire book", "Adam Davis", Westside);
    public final NonFiction GR001 = new NonFiction("Spider book", "Georgia Riles", Westside);


    public Inventories() {
        Central.getInventory().add(AD003);
        Central.getInventory().add(GR002);
        Central.getInventory().add(GR003);
        Central.getInventory().add(GR004);

        Westside.getInventory().add(AD001);
        Westside.getInventory().add(AD002);
        Westside.getInventory().add(GR001);

    }
}
