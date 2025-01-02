package Inheritance.VehicleSystem;

public class Bike extends Vehicle {
    public Bike(String brand, int wheels) {
        super(brand, wheels);
    }

    @Override
    void honk() {
        System.out.println(brand + "BEEP BEEP");
    }
} 