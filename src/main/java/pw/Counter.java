package pw;

public class Counter implements Comparable<Counter> {
    private volatile int value;

    synchronized void increment() {
        value++;
        //Notify is not needed. There is no wait in any of methods
    }

    synchronized void decrement() {
        value--;
    }

    synchronized void reset() {
        value = 0;
    }

    int getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return value; //This is the only field of this class and it's an int
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Counter && ((Counter) o).value == value;
    }

    @Override
    public int compareTo(Counter other) {
        return value - other.value;
    }
}
