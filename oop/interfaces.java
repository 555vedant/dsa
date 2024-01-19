package oop;

// Define the Shape interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Implement the Shape interface in the Circle class
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Implement the Shape interface in the Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class to test the Shape interface implementation
public class interfaces {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Print area and perimeter of the circle
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());

        // Print area and perimeter of the rectangle
        System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());
    }
}
