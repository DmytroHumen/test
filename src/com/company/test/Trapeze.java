package com.company.test;

import com.company.test.Shape;

public class Trapeze extends Shape {

    private double sideUp;
    private double sideDown;
    private double h;

    public Trapeze(double sideUp, double sideDown, double h, String color) {
        super(color);
        this.sideUp = sideUp;
        this.sideDown = sideDown;
        this.h = h;
    }

    @Override
    public void draw() {

    }

    @Override
    public double area() {
        return ((sideUp + sideDown) * h) / 2;
    }

    @Override
    public String toString() {
        return String.format("Фігура: трапеція, площа: %.2f кв.од., довжина верхньої сторони: %.2f, довжина нижньої сторони: %.2f, висота: %.2f од., колір: %s",
                area(), sideUp, sideDown, h, getColor());
    }

}
