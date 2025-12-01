package BridgePattern;

import BridgePattern.Abstraction.*;
import BridgePattern.Implementor.*;

public class BridgePatternMain {
    public static void main(String args[]) {

        Circle redCircle = new Circle(new RedColor());
        Circle blueCircle = new Circle(new BlueColor());

        redCircle.draw();
        blueCircle.draw();
    }
}
