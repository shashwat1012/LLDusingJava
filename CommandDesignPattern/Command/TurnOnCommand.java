package CommandDesignPattern.Command;

import CommandDesignPattern.Receiver.AirConditioner;

public class TurnOnCommand implements ICommand{
    AirConditioner ac;
    public TurnOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }
}
