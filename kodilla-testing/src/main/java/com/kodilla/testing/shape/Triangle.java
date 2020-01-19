package com.kodilla.testing.shape;

public class Triangle implements Shape {
    public double sideTriangle;
    public double height;

    public Triangle(double sideTriangle,double height){
        this.sideTriangle = sideTriangle;
        this.height = height;
    }
    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        return sideTriangle * height * 0.5;
    }
}
