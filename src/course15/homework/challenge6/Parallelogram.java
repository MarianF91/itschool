package course15.homework.challenge6;

public class Parallelogram extends Shape {

    private final double base;
    private final double height;

    protected Parallelogram(double base, double height) {
        super("Parallelogram");
        this.base = base;
        this.height = height;
    }

    @Override
    protected double area() {
        return base * height;
    }
}
