package counter.command;

import counter.JFrameCounterService;
import counter.state.Counter;

public class DecrementCommand implements Command {

    private Counter counter;

    public DecrementCommand(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void execute() {
        counter.decrement();
    }

    @Override
    public void unExecute() {
        counter.increment();
    }
}
