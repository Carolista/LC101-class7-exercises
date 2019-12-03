package org.launchcode.lesson7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(4.0),
                new Triangle(2.0, 3.0),
                new Square(4.0),
                new Rectangle(3.0, 4.0)
        };

        Arrays.sort(shapes);

        for (Shape shape: shapes) {
            System.out.println(shape);
        }

    }
}
