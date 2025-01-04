# Shape Hierarchy

## Project Overview
This Shape Hierarchy project demonstrates the inheritance and polymorphism principles of Object-Oriented Programming (OOP) through a system of shapes. It showcases how different shapes can inherit from a base `Shape` class while implementing their own specific calculations for area and perimeter.

### Class Descriptions

1. **Shape.java**
   - This is the abstract base class that defines the common interface for all shapes.
   - **Methods**:
     - `public abstract double area()`: Calculates the area of the shape.
     - `public abstract double perimeter()`: Calculates the perimeter of the shape.

2. **Circle.java**
   - This class extends `Shape` to represent circles in the system.
   - **Attributes**:
     - `private double radius`: Stores the circle's radius.
   - **Constructor**:
     - `Circle(double radius)`: Initializes a circle with the specified radius.
   - **Methods**:
     - `public double area()`: Returns the circle's area using πr².
     - `public double perimeter()`: Returns the circle's circumference using 2πr.

3. **Rectangle.java**
   - This class extends `Shape` to represent rectangles in the system.
   - **Attributes**:
     - `private double width`: Stores the rectangle's width.
     - `private double height`: Stores the rectangle's height.
   - **Constructor**:
     - `Rectangle(double width, double height)`: Initializes a rectangle with the given dimensions.
   - **Methods**:
     - `public double area()`: Returns the rectangle's area using width × height.
     - `public double perimeter()`: Returns the rectangle's perimeter using 2(width + height).

4. **Start.java**
   - This is the main class that runs the application and demonstrates the shape hierarchy.
   - **Functionality**:
     - Creates instances of different shapes (`Circle` and `Rectangle`).
     - Demonstrates polymorphism by calling `area()` and `perimeter()`.
     - Shows how each shape calculates its measurements differently.

### How to Run
1. Compile all Java files in the `Inheritance/ShapeHierarchy` directory.
2. Run the `Start` class to execute the program.

### Example Output
When you run the program, it will display the calculations for each shape.

```
Circle Area: 78.54
Circle Perimeter: 31.42
Rectangle Area: 24.00
Rectangle Perimeter: 20.00

```