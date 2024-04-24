package com.company.test;

public abstract class Shape {

        private String color;

        public Shape(String color) {
                this.color = color;
        }

        public abstract void draw();

        public abstract double area();

        public String getColor() {
                return color;
        }
}
