package counter.command;

import counter.JFrameCounterService;

public class DecrementCommand implements Command {

    private JFrameCounterService jFrameCounterService;

    public DecrementCommand(JFrameCounterService jFrameCounterService) {
        this.jFrameCounterService = jFrameCounterService;
    }

    @Override
    public void execute() {
        jFrameCounterService.decrement();
    }

    @Override
    public void unExecute() {
        jFrameCounterService.increment();
    }
}
