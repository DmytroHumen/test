package com.company.test.Figure;

import com.company.test.Figure.Shape;

public class Triangle extends Shape {

    private double firstCatet;
    private double secondCatet;
    private double hypotenuse;

    public Triangle(double side1, double side2, String color) {
        super(color);
        this.firstCatet = side1;
        this.secondCatet = side2;
        this.hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
    }

    @Override
    public void draw() {

    }

    @Override
    public double area() {
        return 0.5 * firstCatet * secondCatet;
    }

    @Override
    public String toString() {
        return String.format("Фігура: трикутник, площа: %.2f кв.од., гіпотенуза: %.2f од., колір: %s",
                area(), hypotenuse, getColor());
    }
}
