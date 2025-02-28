package course18recap.challenge3;

public class Car {

    private final String make;
    private final String model;
    private final String color;
    private final int year;

    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String start() {
        return "The car, model " + model + ", color " + color + ", made by " + make + " in " + year + " is starting.";
    }

    public String accelerate() {
        return "The car, model " + model + ", color " + color + ", made by " + make + " in " + year + " is accelerating.";
    }

    public String brake() {
        return "The car, model " + model + ", color " + color + ", made by " + make + " in " + year + " is stopping.";
    }
}
