package course18recap.challenge7;

public class Circle extends  Shape{

    private final String name;
    private final double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
