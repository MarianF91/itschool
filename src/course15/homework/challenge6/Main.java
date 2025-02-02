package course15.homework.challenge6;

public class Main {

    public static void main(String[] args) {

        Shape triangle = new Triangle(3.5, 4.7);
        Shape parallelogram = new Parallelogram(3.5, 4.7);
        Shape elipse = new Elipse(7.1, 8.5);

        System.out.println("The areas of the shapes are:\n- for triangle: " + triangle.area()
        + "\n- for parallelogram: " + parallelogram.area() + "\n- for elipse: " + elipse.area());

    }
}