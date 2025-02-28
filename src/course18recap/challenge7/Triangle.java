package course18recap.challenge7;

public class Triangle extends Shape{

    private final String name;
    private final double height;
    private final double base;

    public Triangle(double height, double base) {
        this.name = "Triangle";
        this.height = height;
        this.base = base;
    }

    public String getName() {
        return name;
    }

    @Override
    public double area() {
        return (base * height) / 2;
    }

}
