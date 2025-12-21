package MementoPattern.Configuration;

public class ConfigurationMain {
    
    public static void main(String[] args) {
        //initiate a caretaker
        ConfigurationCaretaker careTaker = new ConfigurationCaretaker();
        //initiate a config originator object
        ConfigurationOriginator originator = new ConfigurationOriginator(5,10);
        //initiate a memento object to record this state of the originator
        ConfigurationMemento snapshot1 = originator.createMemento();
        //save in the history
        careTaker.addHistory(snapshot1);
       
        originator.setHeight(7);
        originator.setWidth(12);

        ConfigurationMemento snapshot2 = originator.createMemento();

        careTaker.addHistory(snapshot2);

        //now, we will change the configurations and then try to revert to the previous state

        originator.setHeight(9);
        originator.setWidth(15);

        ConfigurationMemento restoredState = careTaker.undo();
        originator.restoreMemento(restoredState);
        System.out.println(originator.height + " " + originator.width);

    }
}
