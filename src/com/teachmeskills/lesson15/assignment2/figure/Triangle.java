package com.teachmeskills.lesson15.assignment2.figure;

public class Triangle implements IFigure {

    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimeter(){
        return side1 + side2 + side3;
    }

}
