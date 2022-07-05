package Abstraction;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        // Create a list of shapes
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Triangle triangle = new Triangle("Triangle", 3, 4, 5);
        shapes.add(triangle);

        Circle circle = new Circle("Circle", 5);
        shapes.add(circle);

        Ellipse ellipse = new Ellipse("Ellipse", 3, 4);
        shapes.add(ellipse);

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("Equilateral Triangle", 3, 3, 3);
        shapes.add(equilateralTriangle);

        // Print out the shapes
        System.out.println(("\n" + "Shapes: " + shapes + "\n"));

        // Scale all shapes by 3.0
        for (Shape shape : shapes) {
            shape.scale(3);
        }

        System.out.println(("\n" + "Shapes: " + shapes + "\n"));

    }
}
