package course14.homework.challenge6.cars;

public class ElectricCar extends Car {

    private int batteryCapacity;
    private int range;

    @Override
    public void characteristics() {
        super.characteristics();
    }

    public void charge() {
    batteryCapacity = 200000;
    range = 350;
        System.out.println("This is for electric car.");
        System.out.println("This car has the following attributes:\n- Capacity:" + batteryCapacity + " and " + range +
                " km range.");
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }
}