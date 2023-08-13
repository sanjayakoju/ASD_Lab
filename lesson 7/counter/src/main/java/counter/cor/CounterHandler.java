package counter.cor;

import counter.state.Counter;

public class CounterHandler {

    private Handler chainOfHandlers;

    public void setChainOfHandlers(Handler chainOfHandlers) {
        this.chainOfHandlers = chainOfHandlers;
    }

    public void handleCounter(Counter counter) {
        chainOfHandlers.handle(counter);
    }
}
