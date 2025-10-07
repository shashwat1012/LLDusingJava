package FactoryPattern;

import FactoryPattern.Factory.VehicleFactory;
import FactoryPattern.Product.Vehicle;

public class Main {
    public static void main(String args[]) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.design();
        car.manufacture();

        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.design();
        bike.manufacture();
        
    }
}
