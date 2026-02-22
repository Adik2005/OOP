package problem1;

public class Data {
    private double sum;
    private double max;
    private int count;

    public Data() {
        sum = 0.0;
        max = 0.0;
        count = 0;
    }
    public void addValue(double value){
        sum += value;
        if(count == 0 || value > max){
            max = value;
        }
        count++;
    }
    public double getAverage() {
        if (count == 0) return 0.0;
        return sum / count;
    }

    public double getLargest() {
        return max;
    }

    public int getCount() {
        return count;
    }
}
