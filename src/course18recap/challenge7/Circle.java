package course18recap.challenge7;

public class Circle extends Shape {

    private final String name;
    private final double radius;

    public Circle(double radius) {
        this.name = "Circle";
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String name() {
        return name;
    }

    public String getName() {
        return name;
    }
}
