package com.kodilla.testing.shape;

public class Square implements Shape {
    public double sideSquare;

    public Square(double sideSquare){
        this.sideSquare = sideSquare;
    }
    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return sideSquare * sideSquare;
    }
}
