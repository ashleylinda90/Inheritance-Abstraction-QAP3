package Abstraction;

public class Ellipse extends Shape {

    private String ellipse;
    private double majorAxisA;
    private double minorAxisB;

    public Ellipse(String name, double majorAxisA, double minorAxisB) {
        super(name);
        this.majorAxisA = majorAxisA;
        this.minorAxisB = minorAxisB;
    }

    public double getArea() {
        return Math.PI * majorAxisA * minorAxisB;
    }

    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((majorAxisA * majorAxisA + minorAxisB * minorAxisB) / 2);
    }

    public String getName() {
        return "Ellipse";
    }

    public String toString() {
        return "Shape: " + getName() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }

    @Override
    public void scale(double scaleFactor) {
        majorAxisA *= scaleFactor;
        minorAxisB *= scaleFactor;
    }
}
