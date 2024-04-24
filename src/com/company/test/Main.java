package com.company.test;

import com.company.test.Figure.*;
import com.company.test.shapesgenerator.ShapeGenerator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ShapeGenerator shapeGenerator = new ShapeGenerator();
        List<Shape> shapes = shapeGenerator.getShapes(10);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

}

