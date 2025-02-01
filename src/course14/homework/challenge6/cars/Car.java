package course14.homework.challenge6.cars;

public class Car {

    String make;
    String model;
    int year;

    public void characteristics() {

        make = "A car has been made.";
        model = "A car has a model.";
        year = 3000;
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
}