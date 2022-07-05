package Abstraction;

public abstract class Shape implements Scalable {

    private String shapeName;

    public Shape(String name) {
        this.shapeName = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape: " + shapeName;
    };
}
