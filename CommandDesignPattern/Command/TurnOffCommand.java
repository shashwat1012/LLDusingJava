package CommandDesignPattern.Command;

import CommandDesignPattern.Receiver.AirConditioner;

public class TurnOffCommand implements ICommand{
    AirConditioner ac;
    public TurnOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }
}
