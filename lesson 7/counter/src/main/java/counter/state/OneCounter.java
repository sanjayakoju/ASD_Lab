package counter.state;

public class OneCounter extends State {
    public OneCounter(Counter counter) {
        super(counter);
    }

    @Override
    public void increment() {
        int count = counter.getCount();
        counter.setCount(++count);
        checkState();
    }

    @Override
    public void decrement() {
        int count = counter.getCount();
        counter.setCount(--count);
        checkState();
    }

    private void checkState() {
        if(String.valueOf(counter.getCount()).length() == 2) {
            TwoCounter twoCounter = new TwoCounter(counter);
            counter.setState(twoCounter);
        }
        System.out.println(counter);
    }
}
