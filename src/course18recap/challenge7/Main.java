package course18recap.challenge7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle("rectangle",1.1, 2.2);
        Shape triangle = new Triangle("triangle", 3.3, 4.4);
        Shape circle = new Circle("circle", 5.5);

        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(rectangle);
        shapeList.add(triangle);
        shapeList.add(circle);

        for (Shape shape : shapeList){
            System.out.println("The area for " + shape.getName() + " is: " + shape.area());
        }
    }
}