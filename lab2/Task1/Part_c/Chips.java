package Task1.Part_c;
import java.util.Objects;
public class Chips extends Snack{
    private String type;

    public Chips(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chips named " + getBrand() + " found in " + getYear() + ", type:  " + type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        if (!super.equals(o)) return false;

        Chips chips = (Chips) o;
        return Objects.equals(type, chips.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
