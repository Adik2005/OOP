package Task4;

public class Resistor extends Circuit {
    private double resistance;
    private double potentialDifference;

    public Resistor(double resistance) {
        this.resistance = resistance;
        this.potentialDifference = 0.0;
    }

    public double getResistanceValue() {
        return resistance;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        potentialDifference = V;
    }

    @Override
    public String toString() {
        return "Resistor: R = " + resistance + " ohm, V = " + potentialDifference + " V, I = " + getCurrent() + " A, P = " + getPower() + " W";
    }
}