package bank;

import bank.command.Command;

import java.util.ArrayList;
import java.util.Collection;

public class HistoryList {

    private Collection<Command> commandList = new ArrayList<>();
    private Collection<Command> undoList = new ArrayList<>();

    public void undo() {
        if(commandList.size() > 0) {
            Command command = (Command) ((ArrayList<Command>) commandList).get(commandList.size()-1);
            ((ArrayList<Command>) commandList).remove(command);
            command.unExecute();
            undoList.add(command);
        }
    }

    public void redo() {
        if (undoList.size()>0) {
            Command command = (Command) ((ArrayList<Command>) undoList).get(undoList.size()-1);
            command.execute();
            ((ArrayList<Command>)undoList).remove(command);
            commandList.add(command);
        }
    }

    public void addCommand(Command command) {
        commandList.add(command);
    }
}
