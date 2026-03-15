package Task1.Part_c;
import java.util.Objects;
public class Snack {
    private String brand;
    private int year;

    public Snack(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public String getBrand(){
        return brand;
    }
    public int getYear(){
        return year;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setYear(int year){
        this.year = year;
    }
    @Override
    public String toString(){
        return "Snack named " + brand + "found in" + year;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return year == snack.year && Objects.equals(brand, snack.brand);
    }
    @Override
    public int hashCode(){
        return Objects.hash(brand, year);
    }
}
