package BridgePattern.Abstraction;
import BridgePattern.Implementor.*;

public abstract class Shape {
    
    protected Color color; //bridging here, now the abstraction will delegate the task of filling color to the applycolor function of the implementor

    public Shape(Color color) {
        this.color = color;
    }
    public abstract void draw();
}
