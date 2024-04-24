package com.company.test;

import com.company.test.Shape;

public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double hypotenuse;

    public Triangle(double side1, double side2, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
    }

    @Override
    public void draw() {

    }

    @Override
    public double area() {
        return 0.5 * side1 * side2;
    }

    @Override
    public String toString() {
        return String.format("Фігура: трикутник, площа: %.2f кв.од., гіпотенуза: %.2f од., колір: %s",
                area(), hypotenuse, getColor());
    }
}
