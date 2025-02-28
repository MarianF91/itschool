package course18recap.challenge7;

public class Triangle extends Shape{

    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        super("Triangle");
        this.height = height;
        this.base = base;
    }


    @Override
    public double area() {
        return (base * height) / 2;
    }
}
