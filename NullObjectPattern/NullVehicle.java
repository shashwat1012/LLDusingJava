package NullObjectPattern;

public class NullVehicle implements Vehicle{

    //Assuming null behaviour to return 0 values here, can be adjusted according to requirements
    @Override
    public int getTankCapacity() {
        return 0;
    }
    
    @Override
    public int getSeatCapacity() {
        return 0;
    }
}
