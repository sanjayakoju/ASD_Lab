package counter.state;

public abstract class State {

    public Counter counter;

    public State(Counter counter) {
        this.counter = counter;
    }

    public abstract void increment();
    public abstract void decrement();
}
