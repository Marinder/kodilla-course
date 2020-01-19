package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figure = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        figure.add(shape);
    }
    public boolean  removeFigure(Shape shape){
        return true;
    }

    public Shape getFigure(int n){
        return figure.get(n);

    }
    public int getArrayListSize(){
        return  figure.size();
    }


}
