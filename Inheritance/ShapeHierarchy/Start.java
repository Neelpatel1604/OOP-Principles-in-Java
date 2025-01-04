package Inheritance.ShapeHierarchy;

public class Start {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + String.format("%.2f", circle.area()));
        System.out.println("Circle Perimeter: " + String.format("%.2f", circle.perimeter()));
        
        System.out.println("Rectangle Area: " + String.format("%.2f", rectangle.area()));
        System.out.println("Rectangle Perimeter: " + String.format("%.2f", rectangle.perimeter()));
        
    }
}
