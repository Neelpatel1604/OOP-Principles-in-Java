package Inheritance.VehicleSystem;

public class Vehicle {
    String brand;
    int wheels;

    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Wheels: " + wheels);
    }
    void honk() {
        System.out.println();
    }
}
