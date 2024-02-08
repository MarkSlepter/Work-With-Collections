package assignment2;

import assignment2.figure.Circle;
import assignment2.figure.IFigure;
import assignment2.figure.Rectangle;
import assignment2.figure.Triangle;

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
