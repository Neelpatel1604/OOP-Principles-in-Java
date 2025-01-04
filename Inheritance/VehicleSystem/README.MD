# Vehicle Management System

## Project Overview
This project demonstrates the inheritance principle of Object-Oriented Programming (OOP) through a Vehicle Management System. It showcases how different types of vehicles (Car, Bike, Truck) inherit from a base Vehicle class, implementing specific behaviors while sharing common attributes.

### Class Descriptions

1. **Vehicle.java**
   - Abstract base class that defines common properties and behaviors for all vehicles
   - **Instance Variables**:
     - `brand`: String representing the vehicle's brand name
     - `wheels`: Integer representing number of wheels
   - **Methods**:
     - `displayInfo()`: Shows vehicle's brand and wheel count
     - `honk()`: Abstract method for vehicle-specific honking behavior

2. **Car.java**
   - Extends Vehicle class to represent cars
   - **Constructor**:
     - `Car(String brand, int wheels)`: Initializes car with brand and wheel count
   - **Methods**:
     - `honk()`: Implements car-specific honking sound

3. **Bike.java**
   - Extends Vehicle class to represent bikes
   - **Constructor**:
     - `Bike(String brand, int wheels)`: Initializes bike with brand and wheel count
   - **Methods**:
     - `honk()`: Implements bike-specific honking sound

4. **Truck.java**
   - Extends Vehicle class to represent trucks
   - **Constructor**:
     - `Truck(String brand, int wheels)`: Initializes truck with brand and wheel count
   - **Methods**:
     - `honk()`: Implements truck-specific honking sound

5. **Start.java**
   - Main class that demonstrates the functionality
   - **Functionality**:
     - Creates instances of different vehicle types
     - Demonstrates inheritance through method calls
     - Shows polymorphic behavior of vehicles

### How to Run
1. Compile all Java files in the `Inheritance/VehicleSystem` directory
2. Run the `Start` class to execute the program

### Example Output
When you run the program, it displays information about different vehicles and their honking sounds:
```
Brand: Toyota, Wheels: 4
ToyotaHONK HONk
Brand: Yamaha, Wheels: 2
YamahaBEEP BEEP
Brand: Ford, Wheels: 6
FordHOOOOOOONK

```
