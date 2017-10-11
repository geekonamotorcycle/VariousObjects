/**
 *
 * @author Joshua
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if ((this.value + 1) > this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }

    }

    public void setValue(int newValue) {
        if (newValue > this.upperLimit) {

        } else if (newValue < 0) {

        } else {
            this.value = newValue;
        }
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        if (this.value <= 9) {
            return "0" + this.value;
        } else {
            return "" + this.value;
        }

    }
}
