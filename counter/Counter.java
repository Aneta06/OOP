package counter;

public class Counter {

    private int counter;
    private int defaultCounter;


    public Counter(int counter) {
        this.counter = counter;
        defaultCounter = counter;

    }

    public Counter() {
    }

    public void add(int number) {
        this.counter += number;

    }

    public void add() {
       counter ++;

    }

    public int get() {

        return counter;
    }

    public void reset() {

        counter  = defaultCounter;

    }
}

