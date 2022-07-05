package Abstraction;

public class Triangle extends Shape {

    private String triangle;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (side1 + side2 > side3 || side2 + side3 > side1 || side1 + side3 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            System.out.println("Invalid triangle!");
        }
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String getName() {
        return "Triangle";
    }

    public String toString() {
        return "Shape: " + getName() + ", Area: " + getArea() + ", Perimeter: "
                + getPerimeter();
    }

    @Override
    public void scale(double scaleFactor) {
        side1 *= scaleFactor;
        side2 *= scaleFactor;
        side3 *= scaleFactor;
    }

}
