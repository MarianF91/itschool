package course18recap.challenge7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(1.1,2.2);
        Shape triangle = new Triangle(3.3, 4.4);
        Shape circle = new Circle( 5.5);

        List<Shape> shapeList = new ArrayList<>();

        shapeList.add(rectangle);
        shapeList.add(triangle);
        shapeList.add(circle);

        for (Shape shape : shapeList) {
            if (shape instanceof Triangle triangle1) {
                System.out.println("The area for " + triangle1.getName() + " is: " + shape.area());
            } else if (shape instanceof Rectangle rectangle1) {
                System.out.println("The area for " + rectangle1.getName() + " is: " + shape.area());
            } else if (shape instanceof Circle circle1) {
                System.out.println("The area for " + circle1.getName() + " is: " + shape.area());
            }
        }
    }
}