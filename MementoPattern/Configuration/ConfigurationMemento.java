package MementoPattern.Configuration;

public class ConfigurationMemento {
    
    int height;
    int width;
    public ConfigurationMemento(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }
}
