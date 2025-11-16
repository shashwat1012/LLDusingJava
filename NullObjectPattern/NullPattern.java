package NullObjectPattern;

public class NullPattern {
    
    public static void main(String[] args) {
        
        Vehicle vehicle = VehicleFactory.getVehicle("Bike");
        System.out.println(vehicle.getSeatCapacity());
        System.out.println(vehicle.getTankCapacity());
        
        Vehicle validVehicle = VehicleFactory.getVehicle("CAR");
        System.out.println(validVehicle.getSeatCapacity());
        System.out.println(validVehicle.getTankCapacity());
        System.out.println(validVehicle.getWheels(5));
    }
}
