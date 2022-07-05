package Abstraction;

public class Circle extends Shape {

    private String circle;
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String getName() {
        return "Circle";
    }

    public String toString() {
        return "Shape: " + getName() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }

    @Override
    public void scale(double scaleFactor) {
        radius *= scaleFactor;
    }
}
