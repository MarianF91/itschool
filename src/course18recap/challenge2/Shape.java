package course18recap.challenge2;

public class Shape {

    private final double length;
    private final double width;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public double area() {
        return length * width;
    }
}