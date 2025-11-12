package CommandPattern;

public class Button {
    Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void onClick(){
        command.execute();
    }
}
