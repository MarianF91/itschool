package course15.homework.challenge6;

public class Triangle extends Shape {

    private final double base;
    private final double height;

    protected Triangle(double base, double height) {
       super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    protected double area() {
        return (base*height)/2;
    }
}