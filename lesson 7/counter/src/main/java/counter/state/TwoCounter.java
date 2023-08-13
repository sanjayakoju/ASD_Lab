package counter.state;

public class TwoCounter extends State {


    public TwoCounter(Counter counter) {
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
        counter.setCount(++count);
        checkState();
    }

    private void checkState() {
        if(String.valueOf(counter.getCount()).length() == 1) {
            OneCounter oneCounter = new OneCounter(counter);
            counter.setState(oneCounter);
        } else if (String.valueOf(counter.getCount()).length() == 3) {
            ThreeCounter threeCounter = new ThreeCounter(counter);
            counter.setState(threeCounter);
        }
        System.out.println(counter);
    }
}
