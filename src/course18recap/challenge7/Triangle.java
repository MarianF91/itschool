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


    @Override
    public double area() {
        return (base * height) / 2;
    }

    @Override
    public String name() {
        return name;
    }

}
