package CommandDesignPattern;

import CommandDesignPattern.Command.SetTempCommand;
import CommandDesignPattern.Command.TurnOffCommand;
import CommandDesignPattern.Command.TurnOnCommand;
import CommandDesignPattern.Invoker.RemoteControl;
import CommandDesignPattern.Receiver.AirConditioner;

public class CommandDesignPatternMain {
    
    public static void main(String args[]) {
        AirConditioner ac = new AirConditioner();
        RemoteControl rc = new RemoteControl();
        //can add further checks related to toggling between redundant states, if the ac is already on,we dont need to switch it on again, these idempotency checks should be added in the receiver itself
        rc.setCommand(new TurnOnCommand(ac));
        rc.pressButton();

        rc.undo();
        rc.setCommand(new TurnOffCommand(ac));
        rc.pressButton();
        rc.undo();

        rc.setCommand(new SetTempCommand(ac,24));
        rc.pressButton();
        rc.setCommand(new SetTempCommand(ac,20));
        rc.pressButton();
        rc.undo();

    }
}
