package Task1.Part_c;
import java.util.HashSet;

public class SnackTest {
    public static void main(String[] args) {
        HashSet<Chips> chips = new HashSet<>();

        Chips chips1 = new Chips("Lays", 1950, "Original");
        Chips chips2 = new Chips("Lays", 1950, "Original");
        Chips chips3 = new Chips("Slang", 2020, "Stax");

        chips.add(chips1);
        chips.add(chips2);
        chips.add(chips3);

        System.out.println("Number of chips in set: " + chips.size());
        System.out.println(chips);
    }
}
