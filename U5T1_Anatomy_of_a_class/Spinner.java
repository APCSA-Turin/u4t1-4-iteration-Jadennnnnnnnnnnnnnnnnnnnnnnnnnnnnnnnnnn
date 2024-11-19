public class Spinner {
    private int count = 0;
    private int sum = 0;
    private int value = 0;
    private int max;

    public Spinner(int max) {
        this.max = max;
    }

    public int getSpinValue() {
        return value;
    }

    public int getSpinCount() {
        return count;
    }

    public int getSpinSum() {
        return sum;
    }

    public void spin() {
        int x = (int) (Math.random() * max) + 1;
        count ++;
        value = x;
        sum += x;
    }

    public double averageSpin() {
        return (double) sum / count;
    }
}
