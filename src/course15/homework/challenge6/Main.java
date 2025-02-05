package course15.homework.challenge6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Shape triangle = new Triangle(3.5, 4.7);
        Shape parallelogram = new Parallelogram(3.5, 4.7);
        Shape ellipse = new Ellipse(7.1, 8.5);

        List<Shape> shapeList = new ArrayList<>();


        shapeList.add(triangle);
        shapeList.add(parallelogram);
        shapeList.add(ellipse);

        System.out.println(shapeList);
    }
}