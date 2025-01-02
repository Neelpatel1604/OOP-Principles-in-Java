package Inheritance.VehicleSystem;

public class Car extends Vehicle {
    public Car(String brand, int wheels) {
        super(brand, wheels);
    }

    @Override
    void honk() {
        System.out.println(brand + "HONK HONk");
    }
} 