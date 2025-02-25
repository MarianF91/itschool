package course18recap.challenge7;

public class Rectangle extends Shape {

    private final String name;
    private final double length;
    private final double width;

    public Rectangle(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public String getName() {
        return name;
    }

    @Override
    public double area() {
        return length * width;
    }
}
