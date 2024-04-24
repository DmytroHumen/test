package com.company.test;

import com.company.test.Shape;

public class Square extends Shape {

    private double sideLength;

    public Square(double sideLength, String color) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {

    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return String.format("Фігура: квадрат, площа: %.2f кв.од., довжина сторони: %.2f од., колір: %s",
                area(), sideLength, getColor());
    }

}
