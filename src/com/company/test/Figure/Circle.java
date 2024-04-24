package com.company.test.Figure;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {

    }

    @Override
    public double area() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return String.format("Фігура: круг, площа: %.2f кв.од., радіус: %.2f од., колір: %s",
                area(), radius, getColor());
    }
}
