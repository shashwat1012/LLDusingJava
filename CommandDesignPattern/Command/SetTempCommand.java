package CommandDesignPattern.Command;

import CommandDesignPattern.Receiver.AirConditioner;

public class SetTempCommand implements ICommand{
    AirConditioner ac;
    int newTemp;
    Integer prevTemp = null;
    public SetTempCommand(AirConditioner ac,int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
    }

    
    @Override
    public void execute() {
        prevTemp = ac.getTemp();
        ac.setTemp(newTemp);
    }

    @Override
    public void undo() {
        if(prevTemp == null) {
            return;
        }
        ac.setTemp(prevTemp);
    }
}
