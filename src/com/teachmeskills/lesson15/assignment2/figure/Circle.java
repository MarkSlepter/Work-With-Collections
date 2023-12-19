package com.teachmeskills.lesson15.assignment2.figure;

public class Circle implements IFigure {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

}
