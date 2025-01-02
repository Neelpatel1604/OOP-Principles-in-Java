# Vehicle System

## Overview
The Vehicle System is a demonstration of inheritance in Java, showcasing how different types of vehicles can be represented as subclasses of a base class. This system includes a base class `Vehicle` and three subclasses: `Car`, `Bike`, and `Truck`.

## Classes

### 1. Vehicle
- **Description**: The base class for all vehicles. It contains common attributes and methods that all vehicles share.
- **Attributes**:
  - `String brand`: The brand of the vehicle.
  - `int wheels`: The number of wheels the vehicle has.
- **Methods**:
  - `void displayInfo()`: Displays the brand and number of wheels.
  - `void honk()`: A method to be overridden by subclasses to provide specific honking behavior.

### 2. Car
- **Description**: A subclass of `Vehicle` representing cars.
- **Constructor**: 
  - `Car(String brand, int wheels)`: Initializes the car with a brand and number of wheels.
- **Methods**:
  - `void honk()`: Outputs a honking sound specific to cars.

### 3. Bike
- **Description**: A subclass of `Vehicle` representing bikes.
- **Constructor**: 
  - `Bike(String brand, int wheels)`: Initializes the bike with a brand and number of wheels.
- **Methods**:
  - `void honk()`: Outputs a honking sound specific to bikes.

### 4. Truck
- **Description**: A subclass of `Vehicle` representing trucks.
- **Constructor**: 
  - `Truck(String brand, int wheels)`: Initializes the truck with a brand and number of wheels.
- **Methods**:
  - `void honk()`: Outputs a honking sound specific to trucks.

## Usage
The `Start` class contains the `main` method, which creates instances of each vehicle type and demonstrates their functionality by calling `displayInfo()` and `honk()` methods.

