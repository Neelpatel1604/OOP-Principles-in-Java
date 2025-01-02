package Inheritance.VehicleSystem;

public class Truck extends Vehicle {
    public Truck(String brand, int wheels) {
        super(brand, wheels);
    }

    @Override
    void honk() {
        System.out.println(brand + "HOOOOOOONK");
    }
} 