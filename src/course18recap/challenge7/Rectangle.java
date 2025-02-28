package course18recap.challenge7;

public class Rectangle extends Shape {

    private final String name;
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.name = "Rectangle";
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String name() {
        return name;
    }
}
