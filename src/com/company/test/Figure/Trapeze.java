package com.company.test.Figure;

import com.company.test.Figure.Shape;

public class Trapeze extends Shape {

    private double sideUp;
    private double sideDown;
    private double height;

    public Trapeze(double sideUp, double sideDown, double height, String color) {
        super(color);
        this.sideUp = sideUp;
        this.sideDown = sideDown;
        this.height = height;
    }

    @Override
    public void draw() {

    }

    @Override
    public double area() {
        return ((sideUp + sideDown) * height) / 2;
    }

    @Override
    public String toString() {
        return String.format("Фігура: трапеція, площа: %.2f кв.од., довжина верхньої сторони: %.2f, довжина нижньої сторони: %.2f, висота: %.2f од., колір: %s",
                area(), sideUp, sideDown, height, getColor());
    }

}
