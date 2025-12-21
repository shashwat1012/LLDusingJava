package MementoPattern.Configuration;
import java.util.*;

public class ConfigurationCaretaker {
    
    List<ConfigurationMemento> history = new ArrayList<>();

    public void addHistory(ConfigurationMemento memento) {
        history.add(memento);
    }

    public ConfigurationMemento undo() {
        if(!history.isEmpty()) {
            int lastIndex = history.size() - 1;
            ConfigurationMemento lastMemento = history.get(lastIndex);
            history.remove(lastMemento);
            return lastMemento;
        }
        return null;
    }
}
