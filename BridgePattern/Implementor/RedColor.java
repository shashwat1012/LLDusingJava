package BridgePattern.Implementor;

public class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.println("Applying Red Color");
    }
}
