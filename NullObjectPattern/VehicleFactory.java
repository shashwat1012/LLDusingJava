package NullObjectPattern;

public class VehicleFactory {

    //in factory designs, methods for creating instances shouldnt depend on the instances themselves, they shouldnt need the objects for creating one, so they should be marked as static
    static Vehicle getVehicle(String vehicleType) {

        if(vehicleType.equalsIgnoreCase("Car")) {
            return new Car();
        }
        return new NullVehicle();
    }
}
