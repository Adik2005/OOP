package Task4;

public class CircuitTest {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        System.out.println("Equivalent resistance: " + circuit.getResistance());

        circuit.applyPotentialDiff(12.0);

        System.out.println("Total voltage: " + circuit.getPotentialDiff());
        System.out.println("Total current: " + circuit.getCurrent());
        System.out.println("Total power: " + circuit.getPower());

        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(circuit);
    }
}