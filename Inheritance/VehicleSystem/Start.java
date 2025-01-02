package Inheritance.VehicleSystem;

public class Start {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 4);
        Vehicle bike = new Bike("Yamaha", 2);
        Vehicle truck = new Truck("Ford", 6);

        car.displayInfo();
        car.honk();
        
        bike.displayInfo();
        bike.honk();
        
        truck.displayInfo();
        truck.honk();
    }
}


