package course14.homework.challenge6.cars;

public class Car {

    private final String make;
    private final String model;
    private final int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void characteristics() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public void start() {
        System.out.println("The car starts.");
    }

    public void stop() {
        System.out.println("The car stops.");
    }

    public void accelerate() {
        System.out.println("The car accelerates.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}