package course15.homework.challenge6;

public class Ellipse extends Shape{

    private final double majorSemiAxe;
    private final double minorSemiAxe;

    protected Ellipse(double majorSemiAxe, double minorSemiAxe) {
        super("Ellipse");
        this.majorSemiAxe = majorSemiAxe;
        this.minorSemiAxe = minorSemiAxe;
    }


    @Override
    protected double area() {
        return Math.PI * majorSemiAxe * minorSemiAxe;
    }

    @Override
    public String toString() {
        return "\nThe area for ellipse is: " + area();
    }
}