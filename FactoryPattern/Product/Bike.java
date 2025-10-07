package FactoryPattern.Product;

public class Bike implements Vehicle {
    public void design() {
        System.out.println("designing a bike");
    }
    public void manufacture() {
        System.out.println("manufacturing a bike");
    }
}
