package CommandDesignPattern.Invoker;

import CommandDesignPattern.Command.ICommand;

import java.util.*;

public class RemoteControl {
    ICommand command;
    Stack<ICommand> commandHistory = new Stack<>();

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        commandHistory.add(command);
        command.execute();
    }
    public void undo() {
        if(!commandHistory.empty()) {
            ICommand latestCommand = commandHistory.pop();
            latestCommand.undo();
        }
    }
}
