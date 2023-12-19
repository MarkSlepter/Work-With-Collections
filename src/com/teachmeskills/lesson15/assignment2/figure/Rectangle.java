package com.teachmeskills.lesson15.assignment2.figure;

public class Rectangle implements IFigure {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculatePerimeter(){
        return 2*(length + width);
    }

}
