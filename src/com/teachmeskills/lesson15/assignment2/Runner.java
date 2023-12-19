package com.teachmeskills.lesson15.assignment2;

import com.teachmeskills.lesson15.assignment2.figure.Circle;
import com.teachmeskills.lesson15.assignment2.figure.IFigure;
import com.teachmeskills.lesson15.assignment2.figure.Rectangle;
import com.teachmeskills.lesson15.assignment2.figure.Triangle;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<IFigure> figures = new ArrayList<>();
        figures.add((IFigure) new Circle(12));
        figures.add((IFigure) new Circle(25));
        figures.add((IFigure) new Triangle(4,5,7));
        figures.add((IFigure) new Rectangle(11, 33));


        for (IFigure figure: figures){
            System.out.println("The perimeter of the figure is " + figure.calculatePerimeter());
        }

    }

}
