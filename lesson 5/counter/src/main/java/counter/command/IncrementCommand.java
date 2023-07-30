package counter.command;

import counter.JFrameCounterService;

public class IncrementCommand implements Command {

    private JFrameCounterService jFrameCounterService;

    public IncrementCommand(JFrameCounterService jFrameCounterService) {
        this.jFrameCounterService = jFrameCounterService;
    }

    @Override
    public void execute() {
        jFrameCounterService.increment();
    }

    @Override
    public void unExecute() {
        jFrameCounterService.decrement();
    }
}
