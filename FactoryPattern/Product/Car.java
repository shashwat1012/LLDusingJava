package FactoryPattern.Product;

public class Car implements Vehicle {
    public void design() {
        System.out.println("designing a car");
    }
    public void manufacture() {
        System.out.println("manufacturing a car");
    }
}
