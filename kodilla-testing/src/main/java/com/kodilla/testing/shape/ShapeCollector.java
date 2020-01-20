package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> figure = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        figure.add(shape);
    }
    public void  removeFigure(Shape shape){
        figure.remove(shape);
    }

    public Shape getFigure(int n){
        return figure.get(n);

    }

    public void showFigures(){
        for(int i = 0; i < figure.size(); i++){
            System.out.println(figure.get(i));
        }
    }
    public int getArrayListSize(){
        return  figure.size();
    }
}
