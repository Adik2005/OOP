package Task4;

public class Parallel extends Circuit {
    private Circuit first;
    private Circuit second;
    private double potentialDifference;

    public Parallel(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance() {
        double r1 = first.getResistance();
        double r2 = second.getResistance();
        return 1.0 / (1.0 / r1 + 1.0 / r2);
    }

    @Override
    public double getPotentialDiff() {
        return potentialDifference;
    }

    @Override
    public void applyPotentialDiff(double V) {
        potentialDifference = V;

        first.applyPotentialDiff(V);
        second.applyPotentialDiff(V);
    }

    @Override
    public String toString() {
        return "Parallel: R = " + getResistance() +
                " ohm, V = " + potentialDifference +
                " V, I = " + getCurrent() + " A";
    }
}