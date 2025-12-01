package BridgePattern.Abstraction;

import BridgePattern.Implementor.*;

public class Circle extends Shape{

    //we need to use super here explicitly since the parent class has a parameterized constuctor
    public Circle(Color color) {
        super(color);
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle..");
        color.applyColor();
    }

}
