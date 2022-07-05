package Abstraction;

public class EquilateralTriangle extends Shape {

    private String equilateralTriangle;
    private double side1;
    private double side2;
    private double side3;

    public EquilateralTriangle(String name, double side1, double side2, double side3) {
        super(name);
        if (side1 == side2 && side2 == side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Invalid equilateral triangle!");
        }
    }

    public double getArea() {
        return Math.sqrt(3) / 4 * (side1 * side1);
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String getName() {
        return "Equilateral Triangle";
    }

    public String toString() {
        return "Shape: " + getName() + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }

    @Override
    public void scale(double scaleFactor) {
        side1 *= scaleFactor;
        side2 *= scaleFactor;
        side3 *= scaleFactor;
    }
}
