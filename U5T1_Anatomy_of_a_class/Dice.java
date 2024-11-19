public class Dice {
    private int roll = 0;
    private int count = 0;
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int getRollCount() {
        return count;
    }

    public int getRollValue() {
        return roll;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int newSides) {
        sides = newSides;
    }

    public void roll() {
        roll = (int) (Math.random() * sides) + 1;
        count ++;
    }
}