package counter.cor;

import counter.state.Counter;

public class BlueHandler extends Handler {
    public BlueHandler(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Counter counter) {
        if (counter.getCount() % 2 != 0 && (counter.getCount() < 15 || counter.getCount() == 17 || counter.getCount() == 19)) {
            System.out.println("Blue");
        } else {
            nextHandler.handle(counter);
        }
    }
}
