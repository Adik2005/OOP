package problem3;

public class problem3 {
    public static void main(String[] args) {
        Temperature t = new Temperature(20, 'C');
        System.out.println(t.getCelsius() + " C");
        System.out.println(t.getFahrenheit() + " F");
        System.out.println(t.getScale());
    }
}