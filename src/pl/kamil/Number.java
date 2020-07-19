package pl.kamil;

public class Number {
    private int value;
    private int counter;

    public Number(int value, int counter) {
        this.value = value;
        this.counter = counter;
    }

    public int getValue() {
        return value;
    }

    public int getCounter() {
        return counter;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
