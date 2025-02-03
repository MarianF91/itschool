package course14.homework.challenge6.cars;

public class ElectricCar extends Car {


    protected int batteryCapacity;
    protected int range;

    public ElectricCar(String make, String model, int year, int batteryCapacity, int range) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public void charge() {
        System.out.println("This car charges.");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryCapacity=" + batteryCapacity +
                ", range=" + range +
                ", " + super.toString() +
                '}';
    }
}