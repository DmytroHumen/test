package com.company.test.shapesgenerator;

import com.company.test.Figure.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeGenerator {
    public Shape getShape () {
        double random = Math.random();
        int type = (int) (random * 4);
            switch (type) {
                case 0:
                    return new Square(Math.random() * 10, "синій");
                case 1:
                    double rnd = Math.random() * 10;
                    return new Triangle(rnd, rnd / 2, "зелений");
                case 2:
                    return new Circle(Math.random() * 10, "червоний");
                case 3:
                    double base = Math.random() * 10;
                    return new Trapeze(base / 2, base, base / 2, "фіолетовий");
                default:
                    return null;
            }
    }

    public List<Shape> getShapes(int maxExpectedElement) {
        List<Shape> shapes = new ArrayList<>();
        double size = Math.random() * maxExpectedElement;
        for (int i = 0; i < size + 1; i++) {
            shapes.add(getShape());
        }
        return shapes;
    }
}
