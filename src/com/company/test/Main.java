package com.company.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static List<Shape> generateRandomShapes(int numShapes) {
        List<Shape> shapes = new ArrayList<>();
        String[] colors = {"синій", "фіолетовий", "червоний", "зелений", "жовтий"};

        Random random = new Random();

        for (int i = 0; i < numShapes; i++) {
            String color = colors[random.nextInt(colors.length)];
            int choice = random.nextInt(4); //

            if (choice == 0) {
                double sideLength = random.nextDouble() * 10 + 1;
                shapes.add(new Square(sideLength, color));
            } else if (choice == 1) {
                double side1 = random.nextDouble() * 10 + 1;
                double side2 = random.nextDouble() * 10 + 1;
                shapes.add(new Triangle(side1, side2, color));
            } else if (choice == 2){
                double radius = random.nextDouble() * 10 + 1;
                shapes.add(new Circle(radius, color));
            } else {
                double sideUp = random.nextDouble() * 10 + 1;
                double sideDown = random.nextDouble() * 10 + 1;
                double h = random.nextDouble() * 10 + 1;
                shapes.add(new Trapeze(sideUp, sideDown, h, color));
            }
        }

        return shapes;
    }

    public static void main(String[] args) {
        List<Shape> shapesList = generateRandomShapes(10);

        for (Shape shape : shapesList) {
            System.out.println(shape);
        }
    }
}
