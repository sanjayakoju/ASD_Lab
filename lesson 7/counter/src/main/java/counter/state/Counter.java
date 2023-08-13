package counter.state;

import counter.Subject;

public class Counter extends Subject {

    private int count = 0;
    private State state;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void increment() {
        state.increment();
        doNotify(getCount());
    }

    public void decrement() {
        state.decrement();
        doNotify(getCount());
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + count +
                ", state=" + state +
                '}';
    }
}
