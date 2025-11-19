package FacadeDesignPattern.Subsystem;

public class InventoryService {
    public boolean checkstock(String item) {
        //hardcoding all return values as true for now, simply showing how the facade wraps the entire subsystem, can put the actual logic for checking inventory over here
        System.out.println("Checking stock for: " + item);
        return true;
    }
}
