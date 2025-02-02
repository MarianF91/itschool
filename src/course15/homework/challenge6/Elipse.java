package course15.homework.challenge6;

public class Elipse extends Shape{

    private final double majorSemiAxe;
    private final double minorSemiAxe;

    protected Elipse(double majorSemiAxe, double minorSemiAxe) {
        super("Elipse");
        this.majorSemiAxe = majorSemiAxe;
        this.minorSemiAxe = minorSemiAxe;
    }


    @Override
    protected double area() {
        return Math.PI * majorSemiAxe * minorSemiAxe;
    }
}