package problem3;

public class Temperature {
    private double value;
    private char scale;
    public Temperature() {
        value = 0;
        scale = 'C';
    }
    public Temperature(double value) {
        this.value = value;
        scale = 'C';
    }
    public Temperature(char scale) {
        value = 0;
        this.scale = scale;
    }
    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
    public double getCelsius() {
        if (scale == 'C')
            return value;
        return 5 * (value - 32) / 9;
    }
    public double getFahrenheit() {
        if (scale == 'F')
            return value;
        return (9 * value) / 5 + 32;
    }
    public char getScale() {
        return scale;
    }
    public void setValue(double value) {
        this.value = value;
    }
    public void setScale(char scale) {
        this.scale = scale;
    }
    public void set(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
}

