# Shape Hierarchy

## Overview
The Shape Hierarchy is a demonstration of inheritance and polymorphism in Java, showcasing how different shapes can be represented as subclasses of a base class. This system includes an abstract base class `Shape` and two subclasses: `Circle` and `Rectangle`.

## Classes

### 1. Shape
- **Description**: The abstract base class for all shapes. It defines the common interface for calculating area and perimeter.
- **Methods**:
  - `public abstract double area()`: An abstract method to calculate the area of the shape.
  - `public abstract double perimeter()`: An abstract method to calculate the perimeter of the shape.

### 2. Circle
- **Description**: A subclass of `Shape` representing circles.
- **Attributes**:
  - `private double radius`: The radius of the circle.
- **Constructor**: 
  - `Circle(double radius)`: Initializes the circle with a specified radius.
- **Methods**:
  - `public double area()`: Calculates and returns the area of the circle.
  - `public double perimeter()`: Calculates and returns the perimeter (circumference) of the circle.

### 3. Rectangle
- **Description**: A subclass of `Shape` representing rectangles.
- **Attributes**:
  - `private double width`: The width of the rectangle.
  - `private double height`: The height of the rectangle.
- **Constructor**: 
  - `Rectangle(double width, double height)`: Initializes the rectangle with specified width and height.
- **Methods**:
  - `public double area()`: Calculates and returns the area of the rectangle.
  - `public double perimeter()`: Calculates and returns the perimeter of the rectangle.

## Usage
The `Start` class contains the `main` method, which creates instances of each shape type and demonstrates their functionality by calling `area()` and `perimeter()` methods.


## Conclusion
The Shape Hierarchy effectively demonstrates the principles of inheritance and polymorphism in Java, allowing for a clear and organized representation of different shapes.